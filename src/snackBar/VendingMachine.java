package snackBar;

public class VendingMachine {

    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name){
        maxId++;
        
        id = maxId;
        this.name = name;
    }

    //Getter functions
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setter functions
    public void setName(String name) {
        this.name = name;
    }
}