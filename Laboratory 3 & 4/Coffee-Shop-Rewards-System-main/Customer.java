public class Customer {
    String name;
    int points = 0;
    static int totalCustomers = 3;

    Customer() {
        this("Unkown", 0);
    }
    Customer(String n, int p) {
        name = n;
        points = p;
    }

    public void addPoints(int value) {
        points += value;
        System.out.println(name + " earned " + value + " points. Total points: " + points);
    }
    public void redeemReward() {
        if(points < 100) {
            System.out.println("Sorry " + name + " you don't have enough points to redeem a drink!");
        } else {
            points -= 100;
            System.out.println("Congratulations " + name + "! you redeemed a free drink!");
        }
    }
    public void displayCustomerInfo() {
        System.out.println("Customer: " + name + "\n" + "Points: " + points);
        System.out.println("----------------------------");
    }
    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customer: " + totalCustomers);
    }
    public static void getAllowedRewardsRedemption() {
        Customer customer1 = new Customer("Joseph", 100);
        Customer customer2 = new Customer("Peter", 120);
        Customer customer3 = new Customer();
        Customer customer4 = new Customer("Diane", 50);

        System.out.println(customer1.name + " can redeem 1 reward(s).");
        System.out.println(customer2.name + " can redeem 1 reward(s).");
        System.out.println(customer3.name + " can redeem 0 reward(s).");
        System.out.println(customer4.name + " can redeem 0 reward(s).");
    }
}
 