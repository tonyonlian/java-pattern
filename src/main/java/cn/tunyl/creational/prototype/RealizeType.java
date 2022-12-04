package cn.tunyl.creational.prototype;

public class RealizeType implements Cloneable{
    public RealizeType() {
        System.out.println("具体的原型对象创建完成");

    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {

        System.out.println("具有原型复制功能！");
        return (RealizeType) super.clone();
    }
}
