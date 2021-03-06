package verma.lakshay.recepiproject.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import verma.lakshay.recepiproject.domain.Category;
import verma.lakshay.recepiproject.domain.UnitOfMeasure;
import verma.lakshay.recepiproject.repository.CategoryRepository;
import verma.lakshay.recepiproject.repository.UnitOfMeasureRepository;
import verma.lakshay.recepiproject.services.RecipeService;

import javax.xml.ws.RequestWrapper;
import java.util.Optional;

@Controller
@Slf4j
public class indexController {
    private final RecipeService recipeService;

    public indexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        //Adding all data to model that can be used in TYHMEleaf for display
            log.debug("Getting Index Page");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
