package chuck.norris.jokes.controller;

import chuck.norris.jokes.services.JokeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
private JokeServiceInterface service;
    @Autowired
    public JokesController(JokeServiceInterface service) {
        this.service = service;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",service.getJoke());
        return "chuckNorris";
    }
}
