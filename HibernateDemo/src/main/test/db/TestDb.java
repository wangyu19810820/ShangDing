package db;

import domain.Pjbztxgl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDb {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Test
    public void testAdd() {
        Pjbztxgl pjbztxgl = new Pjbztxgl();
        pjbztxgl.setTxmc("aa");
        this.hibernateTemplate.save(pjbztxgl);
    }

    @Test
    public void testLoad() {
        Pjbztxgl pjbztxgl = this.hibernateTemplate.load(Pjbztxgl.class, 1);
        System.out.println(pjbztxgl);
    }

    @Test
    public void testSelectAll() {
        List<Pjbztxgl> list = this.hibernateTemplate.loadAll(Pjbztxgl.class);
        for (Pjbztxgl p : list) {
            System.out.println(p);
        }
    }

    @Test
    public void testJdbc() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "test", "test");
//        connection
    }
}
