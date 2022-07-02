package com.skypro.springshop.springshop.service;

import java.util.List;

public interface ShoppingCartService {
    public String addItem(Integer id);
    public List<Integer> getItems();
}