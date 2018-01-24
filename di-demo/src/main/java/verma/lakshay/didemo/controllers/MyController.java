package verma.lakshay.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import verma.lakshay.didemo.service.GreetingService;

@Controller
public class MyController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    GreetingService greetingServiceImpl;


    public MyController(GreetingService greetingService) {
        this.greetingServiceImpl = greetingService;
    }

    public String sayHello(){
        //System.out.print("Hello!!!- from say hello");
        return greetingServiceImpl.sayGreeting();
    }
}
