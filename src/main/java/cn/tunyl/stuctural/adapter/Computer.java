package cn.tunyl.stuctural.adapter;

import java.util.Objects;

public class Computer {
    public String readSD(SDCard sdCard) {
        if (null ==  sdCard){
            throw new NullPointerException("sd card nullj");
        }

        return sdCard.readSD();
    }
}
