package cn.tunyl.creational.prototype;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 =  new Citation();
        c1.setName("张三");

        Citation c2 = c1.clone();
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
