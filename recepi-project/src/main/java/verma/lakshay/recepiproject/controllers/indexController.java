package verma.lakshay.recepiproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class indexController {
    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        System.out.println("hellojkkjjkj");
        return "index";
    }
}
