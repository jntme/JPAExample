
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private int id;

    private int ects;
    private String name;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany(mappedBy = "subject")
    private List<Student> students = new ArrayList<Student>();

    public Subject(int ects, String name) {
        this.ects = ects;
        this.name = name;
    }

    public Subject() {
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}

