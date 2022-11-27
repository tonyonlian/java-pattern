package cn.tunyl.builder;

public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());


        Meal nonVegMeal = mealBuilder.prepareNoVegMeal();
        System.out.println("No Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cast: " + nonVegMeal.getCost());
    }
}
