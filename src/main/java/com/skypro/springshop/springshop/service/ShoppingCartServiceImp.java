package com.skypro.springshop.springshop.service;

import com.skypro.springshop.springshop.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImp implements ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImp(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public String addItem(Integer id) {
        shoppingCartRepository.create(id);
        return "Товар " + id + " успешно добавлен";
    }

    @Override
    public List<Integer> getItems() {
        return shoppingCartRepository.reade();
    }

}
