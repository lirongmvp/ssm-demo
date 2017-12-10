package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.service.UserService;

import javax.servlet.http.HttpSession;


@Controller
public class UserList {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUserList")
    public ModelAndView findUserList() throws Exception {
        List<User> list = userService.findUserList(null);
        ModelAndView mv = new ModelAndView();
        System.out.printf("---------------");
        mv.addObject("list", list);
        mv.setViewName("/form.jsp");
        return mv;
    }

    @RequestMapping("/login.action")
    public String login(HttpSession session, String username, String password) throws Exception {
        session.setAttribute("username", username);


        return "index.jsp";
    }

    @RequestMapping("/logout.action")
    public String logout(HttpSession session) {
        session.invalidate();//清除session
        return "redirect:/login.jsp";

    }

    @RequestMapping("/test")
    public String test() {
        return "index.jsp";
    }

}
