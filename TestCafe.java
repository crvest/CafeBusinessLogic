import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */
        int numWeeks = 10;
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week %d: %s \n\n",numWeeks, appTest.getStreakGoal(numWeeks));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
        appTest.addCustomer(customers);
        System.out.println("\n");
        }

        // ninja bonus printPriceChart
        appTest.printPriceChart("Donut", .75, 12);
        appTest.printPriceChart("Tumbler", 8.95, 3);
        appTest.printPriceChart("Large Drip Coffee", 3.69, 4);

        // sensei bonus displayMenu overload
        System.out.println("----Display Menu Overload Test----");
        ArrayList<String> menuItems = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        menuItems.add("drip coffee");
        menuItems.add("cappucino");
        menuItems.add("latte");
        menuItems.add("mocha");
        prices.add(1.5);
        prices.add(3.5);
        prices.add(4.5);
        prices.add(3.5);
        appTest.displayMenu(menuItems, prices);
    }
}
