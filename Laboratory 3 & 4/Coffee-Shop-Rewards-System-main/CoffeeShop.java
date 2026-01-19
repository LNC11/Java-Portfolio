public class CoffeeShop {
    public static void main(String args[]) {
        System.out.println("===== COFFEE SHOP REWARDS SYSTEM =====\n");

        Customer customer1 = new Customer("Joseph", 200);
        Customer customer2 = new Customer("Peter", 0);
        Customer customer3 = new Customer();

        customer2.addPoints(200);
        customer2.addPoints(20);
        System.out.println("--------------------------------------");
        customer1.redeemReward();
        customer2.redeemReward();
        customer3.redeemReward();
        System.out.println("--------------------------------------");
        System.out.println("=== Customer Information ===");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();
        System.out.println("--------------------------------------");
        Customer customer4 = new Customer("Diane", 0);
        customer4.addPoints(50);
        Customer.totalCustomers++;
        System.out.println("--------------------------------------");
        System.out.println("=== Customer Information ===");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();
        customer4.displayCustomerInfo();

        Customer.displayTotalCustomers();
        System.out.println("--------------------------------------");
        Customer.getAllowedRewardsRedemption();
    }
}
