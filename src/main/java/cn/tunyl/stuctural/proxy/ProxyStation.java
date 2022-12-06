package cn.tunyl.stuctural.proxy;

public class ProxyStation implements SellTickets{
    private SellTickets station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("卖票前.....");
        station.sell();
        System.out.println("卖票后.....");

    }
}
