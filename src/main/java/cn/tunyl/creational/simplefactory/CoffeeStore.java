package cn.tunyl.creational.simplefactory;

public class CoffeeStore {
    private SimpleFactory simpleFactory;

    public CoffeeStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Coffee orderCoffee(String type) {
        return simpleFactory.createCoffee(type);
    }
}
