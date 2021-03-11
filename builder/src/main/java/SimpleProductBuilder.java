import models.Car;
import models.Product;

import java.util.ArrayList;

public class SimpleProductBuilder implements ProductBuilder {
    private Product product;

    public SimpleProductBuilder(Product prod) {
        this.product = prod;
    }

    @Override
    public ProductBuilder reset() {
        this.product.setDescription(null);
        this.product.setName(null);
        this.product.setSubProducts(new ArrayList<>());
        return this;
    }

    @Override
    public ProductBuilder withNewProduct(Product product) {
        this.product = product;
        return this;
    }

    @Override
    public ProductBuilder setSubProduct(Product product) {
        this.product.addSubProduct(product);
        return this;
    }

    @Override
    public ProductBuilder setName(String name) {
        this.product.setName(name);
        return this;
    }

    @Override
    public ProductBuilder setDescription(String description) {
        this.product.setDescription(description);
        return this;
    }

    @Override
    public Product build() {
        return this.product;
    }
}
