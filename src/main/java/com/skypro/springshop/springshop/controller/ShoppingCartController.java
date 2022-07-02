package com.skypro.springshop.springshop.controller;

import com.skypro.springshop.springshop.repository.ShoppingCartRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartController(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int id) {
        shoppingCartRepository.addItem(id);
        return "Товар " + id + " успешно добавлен";
    }

    @GetMapping("/get")
    public List getItems() {
        return shoppingCartRepository.getItems();
    }
}
