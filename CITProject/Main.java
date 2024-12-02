import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = null;

        System.out.println("Welcome to Pizzamania!");
        System.out.println("Choose Pizza Type:");
        System.out.println("1. Veg Pizza (₹300)");
        System.out.println("2. Non-Veg Pizza (₹400)");
        System.out.println("3. Delux Veg Pizza (₹550)");
        System.out.println("4. Delux Non-Veg Pizza (₹650)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                pizza = new Pizza(300);
                break;
            case 2:
                pizza = new Pizza(400);
                break;
            case 3:
                pizza = new DeluxPizza(550);
                break;
            case 4:
                pizza = new DeluxPizza(650);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        if (!(pizza instanceof DeluxPizza)) {
            System.out.println("Do you want Extra Cheese? (yes/no)");
            if (sc.next().equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }

            System.out.println("Do you want Extra Toppings? (yes/no)");
            if (sc.next().equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
        }

        System.out.println("Do you want to opt for Take Away? (yes/no)");
        if (sc.next().equalsIgnoreCase("yes")) {
            pizza.optForTakeAway();
        }

        System.out.println("\nGenerating Bill...");
        pizza.printBill();

        sc.close();
    }
}