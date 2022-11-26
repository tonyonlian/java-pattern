package cn.tunyl.singeton;

/**
 * 饿汉式
 * 多线程安全
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
