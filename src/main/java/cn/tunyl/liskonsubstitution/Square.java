package cn.tunyl.liskonsubstitution;

public class Square extends Rectangle{

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
