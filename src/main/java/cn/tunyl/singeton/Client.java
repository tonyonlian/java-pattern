package cn.tunyl.singeton;

public class Client {
    public static void main(String[] args) {
        SingletonObject singleton = SingletonObject.getInstance();
        SingletonObject singleton2 = SingletonObject.getInstance();
        System.out.println("是否是同一个对象: " + (singleton == singleton2));

        EnumSingletonObject instance = EnumSingletonObject.INSTANCE;
        EnumSingletonObject inatance2 = EnumSingletonObject.INSTANCE;
        String s = instance.showName();
        System.out.println(s);
        System.out.println("是否是同一个对象： "+ (instance == inatance2));

    }
}
