import models.Car;
import models.Product;

import java.util.ArrayList;

public class VehicleConcrectBuilder implements VehicleBuilder {

    private Product car;

    public VehicleConcrectBuilder() {
        super();
        this.car = new Car();
    }

    @Override
    public VehicleBuilder setSeat(Product seat) {
        this.car.addSubProduct(seat);
        return this;
    }

    @Override
    public VehicleBuilder setEngine(Product engine) {
        this.car.addSubProduct(engine);
        return this;
    }

    @Override
    public ProductBuilder reset() {
        this.car.setDescription(null);
        this.car.setName(null);
        this.car.setSubProducts(new ArrayList<>());
        return this;
    }

    @Override
    public ProductBuilder withNewProduct(Product product) throws Exception {
        if(!(product instanceof Car)) {
            throw new Exception("You need to send a car :)");
        }
        this.car = product;
        return this;
    }

    @Override
    public ProductBuilder setSubProduct(Product product) {
        this.car.addSubProduct(product);
        return this;
    }

    @Override
    public ProductBuilder setName(String name) {
        this.car.setName(name);
        return this;
    }

    @Override
    public ProductBuilder setDescription(String description) {
        this.car.setDescription(description);
        return this;
    }

    @Override
    public Product build() {
        return this.car;
    }
}
