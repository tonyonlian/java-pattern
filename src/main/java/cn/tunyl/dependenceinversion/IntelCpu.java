package cn.tunyl.dependenceinversion;

public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Intel cpu 在运行");
    }
}
