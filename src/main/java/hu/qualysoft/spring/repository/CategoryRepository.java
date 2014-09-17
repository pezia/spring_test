package hu.qualysoft.spring.repository;

import hu.qualysoft.spring.entity.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author zsolt
 */
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
    @Query(value = "SELECT c FROM Category c WHERE c.id = ?1")
    Category findByCustomQuery(Integer id);
}
