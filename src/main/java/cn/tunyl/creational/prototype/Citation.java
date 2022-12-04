package cn.tunyl.creational.prototype;

public class Citation implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println(name + "同学： 在2022学年第一学期表现优秀被评为三好学生。特发此状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
       return (Citation)super.clone();
    }
}
