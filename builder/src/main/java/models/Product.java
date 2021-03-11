package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Product {
    private String name;
    private String description;
    private List<Product> subProducts = new ArrayList<>();

    public Product(String name, String description, List<Product> subProducts) {
        this.name = name;
        this.description = description;
        this.subProducts = subProducts;
    }

    public Product() {
    }

    public void addSubProduct(Product prod) {
        this.subProducts.add(prod);
    }

    public void removeSubProduct(Product prod) {
        this.subProducts.remove(prod);
    }

    public Product removeSubProductWithName(String name) throws Exception {
        Optional<Product> opProduct = this.subProducts.stream().filter(e -> {
            return e.name.equals(name);
        }).findFirst();

        return opProduct.isPresent() ? opProduct.get() : null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<Product> subProducts) {
        this.subProducts = subProducts;
    }

    public abstract String doSomething();
    public abstract String getCompleteDescription();
}
