package com.skypro.springshop.springshop.repository;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

import java.util.List;


@Repository
@SessionScope
public class ShoppingCartRepositoryImp implements ShoppingCartRepository {

    //сделал сначала Map, но по заданию товар может повторяться, поэтому сделал обычный лист
    private final List<Integer> shoppingCart;

    public ShoppingCartRepositoryImp() {
        this.shoppingCart = new ArrayList<>();
    }

    @Override
    public void addItem(int id) {
        shoppingCart.add(id);
    }

    @Override
    public List<Integer> getItems() {
        return shoppingCart;
    }
}
