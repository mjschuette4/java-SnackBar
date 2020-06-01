package snackBar;

public class Customer {

    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer (String name, double cash) {
        maxId++;

        id = maxId;
        this.name = name;
        this.cash = cash;
    }
    
    //Getter functions
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    //Setter functions
    public void setName(String name) {
        this.name = name;
    }

    public void moneyAdd(double moneyAdded) {
        this.cash = this.cash + moneyAdded;
    } 

    public void moneySubtract(double moneySubtracted) {
        this.cash = this.cash - moneySubtracted;
    }
}