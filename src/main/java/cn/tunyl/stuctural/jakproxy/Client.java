package cn.tunyl.stuctural.jakproxy;

public class Client {

    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObj = factory.getProxyObject();
        proxyObj.sell();
    }
}
