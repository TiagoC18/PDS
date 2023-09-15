import java.util.ArrayList;
import java.util.List;

// GradingSystem class
public class GradingSystem {
    private List<StudentAdm> studentsAdm = new ArrayList<>();
    private List<Director> directors = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();

    // Add a student to the system
    // The director of student's course is added as Monitor
    public StudentAdm addStudent(Student student) {
        StudentAdm studentAdm = new StudentAdm(student);
        studentsAdm.add(studentAdm);

        // Check if a director for this course exists, if not create one
        Director director = findDirectorByCourse(student.getCourse());
        if (director == null) {
            director = new Director(studentAdm, student.getCourse());
            directors.add(director);
        } else {
            director.addStudent(studentAdm);
        }
        
        return studentAdm;
    }   

    // Add a director to the system
    // The director is added as monitor of the students in the same course
    public Director addDirector(Course course) {
        Director director = findDirectorByCourse(course);
        if (director != null) {
            throw new IllegalArgumentException("A director for this course already exists.");
        }
        
        director = new Director(null, course);
        directors.add(director);

        // Add director as monitor for students in the same course
        for (StudentAdm studentAdm : studentsAdm) {
            if (studentAdm.getStudent().getCourse().equals(course)) {
                director.addStudent(studentAdm);
            }
        }

        return director;
    } 

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    private Director findDirectorByCourse(Course course) {
        for (Director director : directors) {
            if (director.getCourseName().equals(course)) {
                return director;
            }
        }
        return null;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public List<Professor> getProfessors() {
        return professors;
    }
}
