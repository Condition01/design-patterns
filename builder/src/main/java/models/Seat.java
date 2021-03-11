package models;

public class Seat extends Product {
    @Override
    public String doSomething() {
        return "This seat stinks";
    }
    @Override
    public String getCompleteDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getDescription()).append("\n").append(this.doSomething());
        return sb.toString();
    }
}
