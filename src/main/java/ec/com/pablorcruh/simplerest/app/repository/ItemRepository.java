package ec.com.pablorcruh.simplerest.app.repository;

import ec.com.pablorcruh.simplerest.app.models.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Pablo Cruz
 */
public interface ItemRepository extends CrudRepository<Item,Long> {
}
