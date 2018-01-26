import javafx.scene.effect.PerspectiveTransform;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;

import static java.sql.Date.valueOf;

public class Main {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("sophobia").createEntityManager();

        Student hans = new Student("Muster", "Hans", "12.12.2012");
        Student fritz = new Student("Heimrich", "Fritz", "12.12.2017");

        Teacher t1 = new Teacher("Lehrername1", "Prename1", "01.01.1988");
        Teacher t2 = new Teacher("Lehrername2", "Prename2", "01.01.1990");

        Subject se = new Subject(6, "Software Engineering");
        Subject db = new Subject(6, "Databases");

        se.addStudent(hans);
        se.setTeacher(t1);

        EntityTransaction t = em.getTransaction();
        t.begin();

        em.persist(hans);
        em.persist(fritz);

        em.persist(t1);
        em.persist(t2);

        em.persist(se);
        em.persist(db);

        t.commit();
    }
}
