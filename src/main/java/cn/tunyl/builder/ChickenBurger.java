package cn.tunyl.builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float getCost() {
        return 50.5f;
    }
}
