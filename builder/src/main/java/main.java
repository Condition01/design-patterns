import models.Product;

public class main {
    public static void main(String[] args) {
        VehicleBuilder vBuilder = new VehicleConcrectBuilder();
        VehicleDirector vDirector = new VehicleDirector(vBuilder);

        Product fiatPremium = vDirector.buildFiatPremium();
        System.out.println(fiatPremium.getCompleteDescription());
    }
}
