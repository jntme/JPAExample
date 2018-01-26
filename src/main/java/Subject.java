
import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int ects;
    private String name;

//    @ManyToOne
//    private TeachingStaff staff;

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

//    public Staff getStaff() {
//        return staff;
//    }
//
//    public void setTeachingStaff(TeachingStaff staff) {
//        this.staff = staff;
//    }
}

