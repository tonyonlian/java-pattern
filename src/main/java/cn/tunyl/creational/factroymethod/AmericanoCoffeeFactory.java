package cn.tunyl.creational.factroymethod;

public class AmericanoCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
