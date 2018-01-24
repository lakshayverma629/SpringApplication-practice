package verma.lakshay.didemo.controllers;

import org.springframework.stereotype.Controller;
import verma.lakshay.didemo.service.GreetingService;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.print("Hello!!!");
        return greetingService.sayGreeting();
    }
}
