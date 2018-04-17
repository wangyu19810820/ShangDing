package db;

import domain.Pjbztxgl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.PjbztxglService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {

    @Autowired
    private PjbztxglService service;

    @Test
    public void test() {
        service.add();
        List<Pjbztxgl> pjbztxglList = service.loadAll();
        System.out.println(pjbztxglList);
    }
}
