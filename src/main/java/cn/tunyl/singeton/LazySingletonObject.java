package cn.tunyl.singeton;

/**
 * 懒汉式
 * 多线程安全： 否
 *
 */
public class LazySingletonObject {
    private static LazySingletonObject instance;

    private LazySingletonObject() {

    }

    public static LazySingletonObject getInstance() {
        if (null == instance) {
            instance = new LazySingletonObject();
        }
        return instance;
    }
}
