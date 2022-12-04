package cn.tunyl.creational.prototype;


public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1 =  new RealizeType();
        RealizeType r2 = r1.clone();
        System.out.println("对象r1和r2是同一个对象吗？"+(r1 == r2));
    }
}
