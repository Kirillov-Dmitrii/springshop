package com.skypro.springshop.springshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;


@Repository
@SessionScope
public class ShoppingCartRepositoryImpl implements ShoppingCartRepository {

    //сделал сначала Map, но по заданию товар может повторяться, поэтому сделал обычный лист
    private final List<Integer> shoppingCart;

    public ShoppingCartRepositoryImpl() {
        this.shoppingCart = new ArrayList<>();
    }


    @Override
    public void create(Integer id) {
        shoppingCart.add(id);
    }

    @Override
    public List<Integer> reade() {
        return shoppingCart;
    }

    @Override
    public void update(Integer index, Integer id) {
        shoppingCart.add(index, id);
    }

    @Override
    public void delete(Integer id) {
        shoppingCart.remove(id);
    }
}
