package com.skypro.springshop.springshop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;


@Repository
@SessionScope
public class ShoppingCartRepository {

    //сделал сначала Map, но по заданию товар может повторяться, поэтому сделал обычный лист
    private final List<Integer> shoppingCart;

    public ShoppingCartRepository() {
        this.shoppingCart = new ArrayList<>();
    }

    public List<Integer> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "ShoppingCartRepository{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartRepository that = (ShoppingCartRepository) o;
        return Objects.equals(shoppingCart, that.shoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingCart);
    }
}
