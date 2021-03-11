import models.Engine;
import models.Product;
import models.Seat;

public class VehicleDirector {
    private VehicleBuilder vBuilder;

    public VehicleDirector(VehicleBuilder builder) {
        this.vBuilder = builder;
    }

    public VehicleDirector() {
    }

    public Product buildFiatPremium(){
        SimpleProductBuilder pBuilder = new SimpleProductBuilder(new Engine());
        Product eng = pBuilder
                .setName("Bad Engine")
                .setDescription("This is a Bad Engine")
                .build();
        pBuilder.withNewProduct(new Seat());
        Product seat = pBuilder
                .setName("Bad Seat")
                .setDescription("This is a Bad and Stinky Seat")
                .build();
        return this.vBuilder
                .setEngine(eng)
                .setSeat(seat)
                .setName("FIAT Premium")
                .setDescription("This car is Bad AF")
                .build();
    }

    public Product buildVolvoTruck(){
        SimpleProductBuilder pBuilder = new SimpleProductBuilder(new Engine());
        Product eng = pBuilder
                .setName("Good Engine")
                .setDescription("This is a Really Good Engine!!")
                .build();
        pBuilder.withNewProduct(new Seat());
        Product seat = pBuilder
                .setName("Comfortable Seat")
                .setDescription("This is a Really Comfortable Seat!!")
                .build();
        return this.vBuilder
                .setEngine(eng)
                .setSeat(seat)
                .setName("VOLVO Truck")
                .setDescription("This Truck is Power BRO")
                .build();
    }

    public ProductBuilder getvBuilder() {
        return vBuilder;
    }

    public void setvBuilder(VehicleBuilder vBuilder) {
        this.vBuilder = vBuilder;
    }
}
