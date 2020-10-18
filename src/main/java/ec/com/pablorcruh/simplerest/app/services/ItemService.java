package ec.com.pablorcruh.simplerest.app.services;

import ec.com.pablorcruh.simplerest.app.models.Item;

import java.util.List;

/**
 * @author Pablo Cruz
 */
public interface ItemService {

    List<Item> getAllItem();
    Item createItem(Item item);
    Item updateItem(Item item);
    void deleteItem(Long id);
}
