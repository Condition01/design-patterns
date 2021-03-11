package models;

public class Truck extends Product {
    @Override
    public String doSomething() {
        return "The Truck Sound is Loud AF";
    }
    @Override
    public String getCompleteDescription() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(this.getDescription())
                .append("\n")
                .append(this.doSomething())
                .append("\n");
        if (!this.getSubProducts().isEmpty()) {
            this.getSubProducts().forEach(e -> {
                sb.append(e.getCompleteDescription()).append("\n");
            });
        }
        return sb.toString();
    }
}
