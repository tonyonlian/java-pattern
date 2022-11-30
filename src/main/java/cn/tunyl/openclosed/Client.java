package cn.tunyl.openclosed;

public class Client {
    public static void main(String[] args) {
        SouGouInput souGou = new SouGouInput(new LightSpecificSkin());
        souGou.display();
    }
}
