import java.util.ArrayList;

public class CafeUtil {

    // sums all consecutive integers from 1 to numweeks
    public int getStreakGoal(int numWeeks) 
    {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) 
        {
            sum += i;
        }
        return sum;
    }

    // sums the item prices from an order and returns total
    public double getOrderTotal(double[] prices)
    {
        double sum = 0;
        for (double item:prices)
        {
            sum += item;
        }
        return sum;
    }

    // give an ArrayList of menu items, print out each index and menu item
    public void displayMenu(ArrayList<String> menuItems)
    {
        for(int i = 0; i < menuItems.size(); i++)
        {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // add customer
    public void addCustomer(ArrayList<String> customers)
    {
        System.out.println("Please enter your name");
        // accepts command line input
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        // prints the number of people already saved to ArrayList
        System.out.println("There are " + customers.size() + " people in front of you");
        // adds customer to list
        customers.add(userName);
    }

    // ninja bonus
    public void printPriceChart(String product, double price, int maxQuantity)
    {
        System.out.println("---------");
        System.out.println(product);
        for(int i = 1; i <= maxQuantity; i++)
        {
            String output = String.format("%d - $%.2f", i, price*i);
            System.out.println(output);
        }
    }

    // sensei bonus
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
    {
        // return false is arrays are different size
        if(menuItems.size() != prices.size())
        {
            return false;
        }
        // output menu otherwise
        for(int i = 0; i < menuItems.size(); i++)
        {
            String output = String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i));
            System.out.println(output);
        }
        return true;


    }
}