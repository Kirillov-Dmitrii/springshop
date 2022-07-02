package com.skypro.springshop.springshop.service;

import com.skypro.springshop.springshop.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImp implements ShoppingCartService {
    ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImp(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public void addItem(int id) {
        shoppingCartRepository.getShoppingCart().add(id);
    }

    @Override
    public List<Integer> getItems() {
        return shoppingCartRepository.getShoppingCart();
    }
}
