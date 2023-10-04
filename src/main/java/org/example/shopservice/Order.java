package org.example.shopservice;

import java.math.BigDecimal;
import java.util.ArrayList;

public record Order(
        String orderId,
        String customerName,
        ArrayList<Product> orderProducts
        ) {
}
