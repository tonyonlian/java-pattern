package cn.tunyl.dependenceinversion;

public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("保存数据到金士顿内存");
    }
}
