package factory_method;

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units) {
        System.out.print(units * rate);
    }
}
