package cn.tunyl.singeton;

import java.sql.SQLOutput;

public enum EnumSingletonObject {
    /**
     * 实例
     */
    INSTANCE;

    EnumSingletonObject() {
        System.out.println("构造函数");
    }

    /**
     *
     * @return
     */
    public String showName() {
        return INSTANCE.name();
    }
}
