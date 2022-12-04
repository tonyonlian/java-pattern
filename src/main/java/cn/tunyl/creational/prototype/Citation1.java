package cn.tunyl.creational.prototype;

import java.io.Serializable;

public class Citation1 implements Cloneable, Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学： 在2022学年第一学期表现优秀被评为三好学生。特发此状");
    }

    @Override
    protected Citation1 clone() throws CloneNotSupportedException {
       return (Citation1)super.clone();
    }
}
