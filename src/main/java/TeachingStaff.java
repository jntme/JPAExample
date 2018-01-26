import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//for JOINED_TABLE:
//@DiscriminatorValue("TS")
//for SINGLE_TABLE:
//@DiscriminatorValue("TS")
//for TABLE_PER_CLASS:
//nothing ;-)
public class TeachingStaff extends Staff {

    String style;

    public TeachingStaff(String lehrername1, String prename1, String s, String style) {
        super(lehrername1, prename1, s);

        this.style = style;
    }

    public TeachingStaff() {
    }
}
