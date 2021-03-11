import models.Product;

public interface VehicleBuilder extends ProductBuilder {
    public VehicleBuilder setSeat(Product seat);
    public VehicleBuilder setEngine(Product engine);
}
