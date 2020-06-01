package snackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    public Snack (String name, int quantity, double cost, int machineId) {
        maxId++;

        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }
    //Getter functions
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getMachineId() {
        return machineId;
    }

    public double totalCost() {
        return quantity * cost;
    }
    
    //Setter functions
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void snacksAdd(int amountAdd) {
        this.quantity = this.quantity + amountAdd;
    }

    public void snacksReduce(int amountReduce) {
        this.quantity = this.quantity - amountReduce;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}