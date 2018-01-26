import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//for JOINED_TABLE:
//@DiscriminatorValue("NTS")
//for SINGLE_TABLE:
//@DiscriminatorValue("NTS")
//for TABLE_PER_CLASS:
//nothing ;-)
public class NonTeachingStaff extends Staff {
    String tool;

    public NonTeachingStaff(String name, String prename, String birthdate, String tool) {
        super(name, prename, birthdate);
        this.tool = tool;
    }

    public NonTeachingStaff() {
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
