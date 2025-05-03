package com.scm.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home page");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About page");
        return "about";
    }

    //Services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services page");
        return "Services";
    }
}
