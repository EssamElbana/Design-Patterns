package main.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        printCoffee(coffee);

        Coffee milkCoffee = new WithMilk(coffee);
        printCoffee(milkCoffee);

        Coffee sprinklesCoffee = new WithSprinkles(milkCoffee);
        printCoffee(sprinklesCoffee);
    }

    static void printCoffee(Coffee c) {
        System.out.println("Cost: " + c.getCost() + " Ingredients: " + c.getIngredients());
    }
}
