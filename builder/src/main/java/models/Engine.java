package models;

public class Engine extends Product {
    @Override
    public String doSomething() {
        return "Vrumm vrumm";
    }
    @Override
    public String getCompleteDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getDescription()).append("\n").append(this.doSomething());
        return sb.toString();
    }
}
