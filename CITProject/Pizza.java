public class Pizza {
    private int basePrice;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void optForTakeAway() {
        this.takeAway = true;
    }

    public int calculateBill() {
        int total = basePrice;
        if (extraCheese) total += 100;
        if (extraToppings) total += 150;
        if (takeAway) total += 20;
        return total;
    }

    public void printBill() {
        System.out.println("Base Price: " + basePrice);
        if (extraCheese) System.out.println("Extra Cheese: 100");
        if (extraToppings) System.out.println("Extra Toppings: 150");
        if (takeAway) System.out.println("Take Away: 20");
        System.out.println("Total Bill: " + calculateBill());
    }
}