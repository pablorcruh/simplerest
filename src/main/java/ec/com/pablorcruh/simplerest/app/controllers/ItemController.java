package ec.com.pablorcruh.simplerest.app.controllers;

import ec.com.pablorcruh.simplerest.app.models.Item;
import ec.com.pablorcruh.simplerest.app.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Cruz
 */

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private ItemService service;

    @Autowired
    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getAllItems(){
        return ResponseEntity.ok(service.getAllItem());
    }

    @PostMapping
    public ResponseEntity<?> createItem(@RequestBody Item item){
        return ResponseEntity.ok(service.createItem(item));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateItem(@RequestBody Item item, @PathVariable Long id){
        Optional<Item> optionalItem = service.findById(id);
        if(optionalItem.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Item itemDB = optionalItem.get();
        itemDB.setName(item.getName());
        itemDB.setPrice(item.getPrice());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.updateItem(itemDB));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteItem(@PathVariable Long id){
        Optional<Item> item = service.findById(id);
        if(item.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        service.deleteItem(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
