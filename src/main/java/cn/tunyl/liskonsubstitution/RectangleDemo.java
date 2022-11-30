package cn.tunyl.liskonsubstitution;


/**
 *
 * 违反里氏替换原则
 * 使用长方形，则调用resize 可打印出长、宽。而正方形，则调用resize 会死循环
 * 在使用长方形的地方，不能使用正方形，违反里氏替换原则
 *
 */
public class RectangleDemo {
    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }


    // 打印长方形的长与宽

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("=================");

        Rectangle rectangle1 = new Square();
        rectangle1.setLength(10);
        resize(rectangle1);
        printLengthAndWidth(rectangle1);
    }
}
