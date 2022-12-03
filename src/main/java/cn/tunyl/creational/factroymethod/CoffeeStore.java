package cn.tunyl.creational.factroymethod;

public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
       return coffeeFactory.createCoffee();
    }
}
