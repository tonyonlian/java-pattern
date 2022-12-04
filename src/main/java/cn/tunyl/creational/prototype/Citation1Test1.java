package cn.tunyl.creational.prototype;

import java.io.*;

/**
 * 深克隆，通过序列化
 */
public class Citation1Test1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation1 c1 = new Citation1();
        Student stu = new Student("张三", "杭州");
        c1.setStudent(stu);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("b.txt"));
        out.writeObject(c1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("b.txt"));

        Citation1 c2 = (Citation1) in.readObject();
        in.close();
        Student stu1 = c2.getStudent();
        stu1.setName("李四");

        System.out.println("stu == stu2?"+(stu == stu1));
        c1.show();
        c2.show();
    }
}
