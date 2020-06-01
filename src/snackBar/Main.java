package snackBar;

public class Main {

    private static void snackBarData () {
        Customer c1 = new Customer("Jane", 42.15);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food Vending Machine");
        VendingMachine v2 = new VendingMachine("Drink Vending Machine");
        VendingMachine v3 = new VendingMachine("Office Vending Machine");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.75, v1.getId());
        Snack s3 = new Snack("Pretzel", 36, 1.75, v1.getId());
        Snack s4 = new Snack("Soda", 36, 1.75, v2.getId());
        Snack s5 = new Snack("Water", 36, 1.75, v2.getId());
    }

    public static void main(String[] args) {
        snackBarData();
    }

}