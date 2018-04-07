package verma.lakshay.recepiproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import verma.lakshay.recepiproject.domain.Category;
import verma.lakshay.recepiproject.domain.UnitOfMeasure;
import verma.lakshay.recepiproject.repository.CategoryRepository;
import verma.lakshay.recepiproject.repository.UnitOfMeasureRepository;

import javax.xml.ws.RequestWrapper;
import java.util.Optional;

@Controller
public class indexController {


    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    //---Constructor Injection
    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional=categoryRepository.findByDescription("Indian");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("TeaSpoon");
        System.out.println("Category id : "+categoryOptional.get().getId());
        System.out.println("Unit of measure Id :"+unitOfMeasureOptional.get().getId());
        return "index";
    }
}
