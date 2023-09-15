package lab;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods for name and age

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class Prototype {
    public static void main(String[] args) {
        // Create a prototype object
        Person originalPerson = new Person("Alice", 30);

        // Clone the prototype to create a new object
        Person clonedPerson = originalPerson.clone();

        // Customize the cloned object
        clonedPerson.setName("Bob");
        clonedPerson.setAge(25);

        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person: " + clonedPerson);
    }
}

