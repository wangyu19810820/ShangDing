package dao;

import com.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class RoleDaoTest {

    @PersistenceUnit
    EntityManagerFactory entityManagerFactory;

    @Test
    public void testAdd() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Role role = new Role();
        role.setName("aa");
        entityManager.persist(role);
    }
}
