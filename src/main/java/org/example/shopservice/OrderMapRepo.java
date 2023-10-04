package org.example.shopservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class OrderMapRepo implements OrderRepo {
    Map<String, Order> orders;
    public OrderMapRepo() {
        orders = new Map<String, Order>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Order get(Object key) {
                return null;
            }

            @Override
            public Order put(String key, Order value) {
                return null;
            }

            @Override
            public Order remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Order> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Order> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Order>> entrySet() {
                return null;
            }
        };
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public void deleteOrder(Order order) {

    }

    @Override
    public Order searchOrder(Product searchedOrder) {
        return null;
    }
}
