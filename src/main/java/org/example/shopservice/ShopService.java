package org.example.shopservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

public class ShopService {
    public ShopService(OrderRepo orderRepo) {
    }

    public void placeOrder(String customerName, ArrayList<Product> orderProducts, OrderListRepo orderListRepo, ProductRepro productRepo) {
        //hier fehlt noch die komplette Prüfung der vorhandenen Produkte
        boolean productsInStock = true;

        for(int i = 0; i <= orderProducts.size()-1; i++) {
            if (productRepo.searchProductByName(orderProducts.get(i).name()) == null) {
                productsInStock = false;
            }
        }
            if(productsInStock){
                orderListRepo.addOrder(new Order(UUID.randomUUID().toString(), customerName, orderProducts));
                BigDecimal totalPrice = new BigDecimal(0);
                for(int i = 0; i <= orderProducts.size()-1; i++){
                    totalPrice = totalPrice.add(orderProducts.get(i).price());
                }
                System.out.println(totalPrice);
            }else{
                System.out.println("Product(s) not in stock!");
            }
    }
}