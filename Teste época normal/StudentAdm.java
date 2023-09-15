import java.util.*;

public class StudentAdm {
    private Student student;
    private List<Monitor> monitors;
    
    public StudentAdm(Student student) {
        this.student = student;
        this.monitors = new ArrayList<>();
    }
    
    public void addMonitor(Monitor monitor) {
        this.monitors.add(monitor);
    }

    public void addScore(String className, double score) {
        student.addScore(className, score);
        for (Monitor monitor : monitors) {
            monitor.output(className, score, student);
        }
    }

    public Student getStudent() {
        return student;
    }
}
