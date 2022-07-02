package com.skypro.springshop.springshop.repository;

import java.util.List;
import java.util.Map;

public interface ShoppingCartRepository<I> {
    public void addItem(int id);
    public List<Integer> getItems();

}
