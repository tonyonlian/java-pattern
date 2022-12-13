package cn.tunyl.stuctural.adapter;

/**
 * 对象适配器：将要适配的类引入到适配类中使用
 */
public class SDAdaterTF1 implements SDCard{
    private TFCard tfCard;

    public SDAdaterTF1(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
