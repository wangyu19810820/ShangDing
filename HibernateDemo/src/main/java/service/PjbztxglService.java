package service;

import domain.Pjbztxgl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PjbztxglService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void add() {
        Pjbztxgl pjbztxgl = new Pjbztxgl();
        pjbztxgl.setTxmc("aa");
        this.hibernateTemplate.save(pjbztxgl);
    }

    public List<Pjbztxgl> loadAll() {
        List<Pjbztxgl> list = this.hibernateTemplate.loadAll(Pjbztxgl.class);
        return list;
    }
}
