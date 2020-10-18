package ec.com.pablorcruh.simplerest.app.services;

import ec.com.pablorcruh.simplerest.app.models.Item;
import ec.com.pablorcruh.simplerest.app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Cruz
 */

@Service
public class ItemServiceImpl implements ItemService{

    private ItemRepository repository;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Item> getAllItem() {
        return (List<Item>) repository.findAll();
    }

    @Override
    public Item createItem(Item item) {
        return repository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return repository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return repository.findById(id);
    }
}
