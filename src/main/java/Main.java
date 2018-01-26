import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {


        EntityManager em = Persistence.createEntityManagerFactory("school").createEntityManager();

        Student hans = new Student("Muster", "Hans", "12.12.2012");
        Student fritz = new Student("Heimrich", "Fritz", "12.12.2017");

        TeachingStaff t1 = new TeachingStaff("Lehrername1", "Prename1", "01.01.1988", "Tafel");
        TeachingStaff t2 = new TeachingStaff("Lehrername2", "Prename2", "01.01.1990", "Hellraumprojektor");

        NonTeachingStaff nt1 = new NonTeachingStaff("Küchenhilfe", "Prename3", "01.01.1999", "Schwingbesen");

        Subject se = new Subject(6, "Software Engineering");
        Subject db = new Subject(6, "Databases");

//        se.setTeachingStaff(t1);

        EntityTransaction t = em.getTransaction();
        t.begin();

        em.persist(hans);
        em.persist(fritz);

        em.persist(t1);
        em.persist(t2);
        em.persist(nt1);

        em.persist(se);
        em.persist(db);

        t.commit();
    }
}
