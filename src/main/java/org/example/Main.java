package org.example;

import org.example.shopservice.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "product1", new BigDecimal("11.11"));
        Product product2 = new Product("2", "product2", new BigDecimal("22.22"));
        Product product3 = new Product("3", "product3", new BigDecimal("33.33"));
        Product product4 = new Product("4", "product4", new BigDecimal("44.44"));

        ProductRepro productRepro1 = new ProductRepro();
        productRepro1.addProduct(product1);
        productRepro1.addProduct(product2);
        productRepro1.addProduct(product3);
        System.out.println(productRepro1);

        productRepro1.addProduct(product4);
        System.out.println(productRepro1);

        productRepro1.deleteProduct(product4);
        System.out.println(productRepro1);

        System.out.println(productRepro1.searchProduct(product2));

        Order order1 = new Order("orderId1", "name1", new ArrayList<>(List.of(product1, product3)));
        Order order2 = new Order("orderId2", "name2", new ArrayList<>(List.of(product2, product3)));
        Order order3 = new Order("orderId3", "name3", new ArrayList<>(List.of(product4)));

        OrderListRepo orderListRepo1 = new OrderListRepo();
        orderListRepo1.addOrder(order1);
        orderListRepo1.addOrder(order2);
        orderListRepo1.addOrder(order3);
        System.out.println(orderListRepo1);

        orderListRepo1.deleteOrder(order2);
        System.out.println(orderListRepo1);

        System.out.println(productRepro1);
        productRepro1.deleteProductByName("product3");
        System.out.println(productRepro1);

        OrderRepo orderRepo1 = new OrderMapRepo();
        ShopService shopService = new ShopService(orderRepo1);

        shopService.placeOrder("customerName1", new ArrayList<>(List.of(product1, product2)), orderListRepo1, productRepro1);
        System.out.println("new order: " + orderListRepo1);

        //System.out.println(productRepro1.searchProductByName(product1.name()));
    }
}