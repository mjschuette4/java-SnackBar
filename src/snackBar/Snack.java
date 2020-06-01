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



    //Setter functions



}