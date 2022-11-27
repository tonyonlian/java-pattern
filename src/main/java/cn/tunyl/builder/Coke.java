package cn.tunyl.builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float getCost() {
        return 30.0f;
    }
}
