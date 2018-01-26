import javax.persistence.*;

@Entity
//for JOINED_TABLE:
//@Inheritance( strategy = InheritanceType.JOINED )
//@DiscriminatorColumn(name="type")
//for SINGLE_TABLE:
//@Inheritance
//@DiscriminatorColumn(name="type")
//for TABLE_PER_CLASS:
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String prename;
    private String birthdate;

    @Transient
    private String thoughts;

    public Staff(String name, String prename, String birthdate) {
        this.name = name;
        this.prename = prename;
        this.birthdate = birthdate;
    }

    public Staff() {
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

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }
}
