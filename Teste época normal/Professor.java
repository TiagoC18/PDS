public class Professor extends Monitor {
    private String className;
    private String name;

    public Professor(StudentAdm adm, String name, String className) {
        super(adm);
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void output(String className, double score, Student student) {
        if (this.className.equals(className)) {
            System.out.println("Professor " + this.name + " of " + className + " class evaluated student " + student.getName() + " (" + student.getId() + ") with score: " + score);
        }
    }
}
