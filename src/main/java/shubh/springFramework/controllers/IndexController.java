package shubh.springFramework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shubh.springFramework.domain.Category;
import shubh.springFramework.domain.UnitOfMeasure;
import shubh.springFramework.repositories.CategoryRepository;
import shubh.springFramework.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }



    @RequestMapping({"","/","/index"})
    public String getindexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("category id is " + categoryOptional.get().getId());
        System.out.println("UOM id is " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
