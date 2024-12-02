public class DeluxPizza extends Pizza {

    public DeluxPizza(int basePrice) {
        super(basePrice);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void printBill() {
        System.out.println("Delux Pizza comes with Extra Cheese and Extra Toppings by default.");
        super.printBill();
    }
}