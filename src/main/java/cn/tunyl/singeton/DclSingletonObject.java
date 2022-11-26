package cn.tunyl.singeton;

/**
 * DCL double checked locking
 * 双检锁/双重校验锁
 * 懒汉式
 * 多线程安全
 * 效率高
 */
public class DclSingletonObject {
    private volatile static DclSingletonObject instance;

    private DclSingletonObject() {

    }

    public static DclSingletonObject getInstance() {
        if (null == instance) {
            synchronized (DclSingletonObject.class) {
                if (null == instance) {
                    instance = new DclSingletonObject();
                }
            }
        }
        return instance;
    }
}
