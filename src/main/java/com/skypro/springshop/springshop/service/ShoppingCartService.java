package com.skypro.springshop.springshop.service;

import java.util.List;

public interface ShoppingCartService {
    public void addItem(int id);
    public List<Integer> getItems();

}