package cn.tunyl.creational.prototype;

/**
 * 浅克隆示例
 */
public class Citation1Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation1 c1 = new Citation1();
        Student stu = new Student("张三", "杭州");
        c1.setStudent(stu);

        Citation1 c2 = c1.clone();
        Student stu1 = c2.getStudent();
        stu1.setName("李四");

        System.out.println("stu与sut1是同一个对象"+ (stu ==stu1));

        c1.show();
        c2.show();
    }
}
