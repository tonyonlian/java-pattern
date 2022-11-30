package cn.tunyl.openclosed;

public class SouGouInput {
    private AbstractSkin skin;

    public SouGouInput(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
