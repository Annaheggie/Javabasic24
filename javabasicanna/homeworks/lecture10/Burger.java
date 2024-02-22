package javabasicanna.homeworks.lecture10;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String parsley;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String parsley, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.parsley = parsley;
        this.mayonnaise = mayonnaise;
        displayComposition();
    }

    public Burger(String bun, String meat, String cheese, String parsley) {
        this(bun, meat, cheese, parsley, "");
    }

    public Burger(String bun, String meat, String cheese, String parsley, String extraMeat, String mayonnaise) {
        this(bun, meat + " + " + extraMeat, cheese, parsley, mayonnaise);
    }

    private void displayComposition() {
        System.out.println("Burger Composition:");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Parsley: " + parsley);
        System.out.println("Mayonnaise: " + mayonnaise);
        System.out.println();
    }
}


class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Regular Bun", "Beef Patty", "Cheddar Cheese", "Fresh Parsley", "Regular Mayonnaise");
        Burger dietBurger = new Burger("Whole Wheat Bun", "Turkey Patty", "Swiss Cheese", "Spinach");
        Burger doubleMeatBurger = new Burger("Sesame Bun", "Beef Patty", "American Cheese", "Lettuce", "Extra Beef Patty", "Regular Mayonnaise");
    }
}
