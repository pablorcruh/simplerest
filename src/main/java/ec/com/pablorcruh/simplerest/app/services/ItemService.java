package ec.com.pablorcruh.simplerest.app.services;

import ec.com.pablorcruh.simplerest.app.models.Item;

import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Cruz
 */
public interface ItemService {

    List<Item> getAllItem();
    Item createItem(Item item);
    Item updateItem(Item item);
    void deleteItem(Long id);
    Optional<Item> findById(Long id);
}
