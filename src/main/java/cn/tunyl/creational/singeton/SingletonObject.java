package cn.tunyl.creational.singeton;

/**
 * 饿汉式
 * 多线程安全
 * 多数情况下使用此方式
 *
 */
public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        return instance;
    }

}
