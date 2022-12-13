package cn.tunyl.stuctural.adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("---------------------");
        SDAdapterTF sdCard1 = new SDAdapterTF();
        System.out.println(computer.readSD(sdCard1));
    }
}
