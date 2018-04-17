package controller;

import domain.Pjbztxgl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.PjbztxglService;

import java.util.List;

@Controller
@RequestMapping("/pjbztxg")
public class PjbztxgController {

    @Autowired
    private PjbztxglService service;

    @RequestMapping("/loadAll")
    public String loadAll() {
        List<Pjbztxgl> list = service.loadAll();
        System.out.println(list);
        return "index";
    }

    @RequestMapping("/add")
    public String add() {
        service.add();
        return "index";
    }

}
