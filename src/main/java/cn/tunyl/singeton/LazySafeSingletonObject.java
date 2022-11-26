package cn.tunyl.singeton;

/**
 * 懒汉式
 * 多线程安全
 * 加锁影响效率，效率低
 */
public class LazySafeSingletonObject {

    private static LazySafeSingletonObject instance;

    private LazySafeSingletonObject() {
    }

    public static synchronized LazySafeSingletonObject getInstance() {
        if (null == instance) {
            instance = new LazySafeSingletonObject();
        }
        return instance;
    }
}
