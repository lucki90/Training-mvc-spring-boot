package pl.lucky.trainingmvcspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    public String home(HttpServletRequest request) {
        String username = request.getParameter("username");
        if (username != null) {
            System.out.println("Hello " + username);
        }
        Cookie[] cookies = request.getCookies();
        if (cookies!=null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + " " + cookie.getValue());
            }
        }
        return "home";
    }


}
