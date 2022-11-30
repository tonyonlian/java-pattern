package cn.tunyl.dependenceinversion;

public class XijieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("保存数据到希捷硬盘");
    }

    @Override
    public String get() {
        return "从希捷硬盘获取数据";
    }
}
