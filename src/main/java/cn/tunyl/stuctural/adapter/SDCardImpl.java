package cn.tunyl.stuctural.adapter;

public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        return "sd card read a message : hello word SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg: "+ msg);
    }

}
