package cn.tunyl.stuctural.adapter;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "tf card read msg : hello word tf card";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write a msg : "+msg);

    }
}
