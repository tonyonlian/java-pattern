package cn.tunyl.creational.builder;

public class Client {
    private static void showBike(Builder builder) {
        System.out.println("++++++++++++++++++++++++");
        Director director = new Director(builder);
        Bike bike =  director.construct();
        System.out.println(bike.getSeat());
        System.out.println(bike.getFrame());
    }

    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new OfoBuilder());
    }
}
