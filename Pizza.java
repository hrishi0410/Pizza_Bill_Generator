public class Pizza {
    private int price;
    private Boolean veg;

    // Final pricing constants for extras:
    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int backpackPrice = 20;
    private final int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeaway = true;
        this.price += backpackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added : " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Take away : " + backpackPrice + "\n";
        }
        bill += "Bill : " + this.price + "\n";
        System.out.println(bill);
    }
}

/**
 * Base Pizza: 300
 * Toppings: 150
 * Cheese:100
 * Take away: 20
 */
