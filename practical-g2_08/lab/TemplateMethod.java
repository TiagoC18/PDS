package lab;

// Abstract class defining the template method
abstract class CoffeeTemplate {
    public void prepareCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    // Abstract methods to be implemented by subclasses
    abstract void brewCoffeeGrinds();
    abstract void addCondiments();

    // Common methods
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }
}

// Concrete subclass 1
class Coffee1 extends CoffeeTemplate {
    @Override
    void brewCoffeeGrinds() {
        System.out.println("Brewing coffee using method 1");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}

// Concrete subclass 2
class Coffee2 extends CoffeeTemplate {
    @Override
    void brewCoffeeGrinds() {
        System.out.println("Brewing coffee using method 2");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding cream and sugar");
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        CoffeeTemplate coffee1 = new Coffee1();
        CoffeeTemplate coffee2 = new Coffee2();

        System.out.println("Preparing Coffee 1:");
        coffee1.prepareCoffee();

        System.out.println("\nPreparing Coffee 2:");
        coffee2.prepareCoffee();
    }
}
