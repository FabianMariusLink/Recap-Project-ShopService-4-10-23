package org.example.shopservice;

import java.util.ArrayList;
import java.util.UUID;

public class ShopService {
    public void placeOrder(String customerName, ArrayList<Product> orderProducts, OrderListRepo orderListRepo, ProductRepro productRepo) {
        for(int i = 0; i <= orderProducts.size()-1; i++) {
            if(productRepo.searchProductByName(orderProducts.get(i).name()) != null){
                orderListRepo.addOrder(new Order(UUID.randomUUID().toString(), customerName, orderProducts));
            }else{
                System.out.println("Product(s) not in stock");
            }
        }
    }
}