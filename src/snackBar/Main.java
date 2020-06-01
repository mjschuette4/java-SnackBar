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

        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");
   
        
        //Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.moneySubtract(s4.getCost() * 3);
        s4.snacksReduce(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getCash() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left.");
   
        //Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.moneySubtract(s3.getCost() * 1);
        s3.snacksReduce(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getCash() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");
    
        //Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4 .
        c2.moneySubtract(s4.getCost() * 2);
        s4.snacksReduce(2);
        System.out.println(c2.getName() + " has " + "$" + c2.getCash() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left.");
    
        
    
    
    }

    public static void main(String[] args) {
        snackBarData();
    }

}