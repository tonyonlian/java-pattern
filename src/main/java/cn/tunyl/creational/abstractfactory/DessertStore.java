package cn.tunyl.creational.abstractfactory;

public class DessertStore {
    private DessertFactory dessertFactory;

    public DessertStore(DessertFactory dessertFactory) {
        this.dessertFactory = dessertFactory;
    }

    public Dessert orderDessert() {
        return dessertFactory.createDessert();
    }

    public Coffee orderCoffee() {
        return dessertFactory.createCoffee();
    }
}

