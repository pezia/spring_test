package hu.qualysoft.spring.repository;

import hu.qualysoft.spring.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author zsolt
 */
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
    
}
