package org.example.shopservice;

public interface OrderRepo {
    void addOrder(Order order);
    void deleteOrder(Order order);
    Order searchOrder(Product searchedOrder);
}
