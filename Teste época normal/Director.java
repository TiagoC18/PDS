public class Director extends Monitor {
    private Course degreeName;
    
    public Director(StudentAdm student, Course course) {
        super(student);
        this.degreeName = course;
        if (student.getStudent().getCourse()!= course) {
            throw new IllegalArgumentException("Director's course must be the same as student's course");
        }
        
    }

    public Course getCourseName() {
        return degreeName;
    }

    @Override
    public void output(String className, double score, Student student) {
        System.out.println(degreeName + " director reports that student " + student.getName() + " (" + student.getId() + ") has changed the overall grade: " + student.getAverageScore());
    }
}
