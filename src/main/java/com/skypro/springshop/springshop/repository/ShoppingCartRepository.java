package com.skypro.springshop.springshop.repository;

import java.util.List;

public interface ShoppingCartRepository {
    public void create(Integer id);
    public List<Integer> reade();
    public void update(Integer index, Integer id);
    public void delete(Integer id);
}
