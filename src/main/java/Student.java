import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    private String name;
    private String prename;
    private String birthdate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public Student(String name, String prename, String birthdate) {
        this.name = name;
        this.prename = prename;
        this.birthdate = birthdate;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
