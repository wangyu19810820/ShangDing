package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping("/doLogin")
    public ModelAndView doLogin() {
        ModelAndView mav = new ModelAndView("jsonView");

        return mav;
    }

    @RequestMapping("/manager")
    public ModelAndView manager() {
        ModelAndView mav = new ModelAndView("manager");
        return mav;
    }

}
