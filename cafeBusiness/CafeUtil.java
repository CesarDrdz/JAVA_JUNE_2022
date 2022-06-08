import java.util.Arrays;
import java.util.ArrayList;
// all methods here

// int getStreakGoal()
// double getOrderTotal(double[] prices)
// void displayMenu(ArrayList<String> menuItems)
// addCustomer(ArrayList<String> customers)

public class CafeUtil{

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i<=10; i++) {
            sum += i;
            // sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        System.out.println(Arrays.toString(prices));
        for (int i=0; i<prices.length; i++) {
            // System.out.println(prices[i]);
            total += prices[i];
        }
        System.out.println(total);
         return total;
    }

    public void displayMenu(ArrayList<String> unicorn){
        System.out.println("CafeUtil : " + unicorn);

        for (int i = 0; i < unicorn.size(); i++) {
            System.out.println(i+ " " + unicorn.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);

        System.out.println(customers.size() + " people in front of you");

        // add user to array
        customers.add(userName);
    }

}


