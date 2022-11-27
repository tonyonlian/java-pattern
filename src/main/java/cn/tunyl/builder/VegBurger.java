package cn.tunyl.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float getCost() {
        return 25.0f;
    }
}
