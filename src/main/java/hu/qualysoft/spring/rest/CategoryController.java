package hu.qualysoft.spring.rest;

import hu.qualysoft.spring.entity.Category;
import hu.qualysoft.spring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zsolt
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository repository;
    
    @RequestMapping("/category")
    public Iterable<Category> getCategories(Pageable pageable) {
        return repository.findAll(pageable);
    }
    
    @RequestMapping("/category/{id}")
    public Category getCategory(@PathVariable Integer id) {
        return repository.findOne(id);
    }
}
