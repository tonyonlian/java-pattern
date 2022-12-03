package cn.tunyl.singeton;

import java.io.Serializable;

public class SeriSingletonObject implements Serializable {

    private SeriSingletonObject() {

    }
    private static class SingletonObjectHolder{
        private static final SeriSingletonObject instance = new SeriSingletonObject();

    }

    public static SeriSingletonObject getInstance() {
        return SingletonObjectHolder.instance;
    }

    /**
     * 下面是o为了防止序列化返序列化破坏单例模式
     * @return
     */
    private Object readResolve() {
        return SingletonObjectHolder.instance;
    }
}
