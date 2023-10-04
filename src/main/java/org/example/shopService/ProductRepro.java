package org.example.shopService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepro {
    List<Product> products = new ArrayList<>();

    public ProductRepro(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepro that = (ProductRepro) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepro{" +
                "products=" + products +
                '}';
    }
}
