package cn.tunyl.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float total = 0.0f;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", packing: " + item.packing().pack());
            System.out.println(",Price : " + item.getCost());
        }
    }
}
