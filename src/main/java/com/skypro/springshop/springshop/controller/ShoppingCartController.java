package com.skypro.springshop.springshop.controller;

import com.skypro.springshop.springshop.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int id) {
        shoppingCartService.addItem(id);
        return "Товар " + id + " успешно добавлен";
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return shoppingCartService.getItems();
    }
}
