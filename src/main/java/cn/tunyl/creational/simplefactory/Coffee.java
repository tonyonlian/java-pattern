package cn.tunyl.creational.simplefactory;

public class Coffee {
    public String getName(){
        return "coffee";
    }
    public void addMilk(){
        System.out.println("add milk");
    }
    public void addSugar(){
        System.out.println("add sugar");
    }
}
