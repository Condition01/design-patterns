import models.Product;

public interface ProductBuilder {
    ProductBuilder reset();
    ProductBuilder withNewProduct(Product product) throws Exception;
    ProductBuilder setSubProduct(Product product);
    ProductBuilder setName(String name);
    ProductBuilder setDescription(String description);
    Product build();
}
