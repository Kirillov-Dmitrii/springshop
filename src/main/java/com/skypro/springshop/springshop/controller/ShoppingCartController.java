package com.skypro.springshop.springshop.controller;

import com.skypro.springshop.springshop.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam Integer id) {
        return shoppingCartService.addItem(id);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return shoppingCartService.getItems();
    }
}
