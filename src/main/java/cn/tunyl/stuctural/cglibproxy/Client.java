package cn.tunyl.stuctural.cglibproxy;

public class Client {
    public static void main(String[] args) {
        ProxFactory factory = new ProxFactory();
        TrainStation obj = factory.getProxyObject();
        obj.sell();
    }
}

