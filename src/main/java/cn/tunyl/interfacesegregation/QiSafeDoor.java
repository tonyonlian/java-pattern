package cn.tunyl.interfacesegregation;

public class QiSafeDoor implements Fireproof, Waterproof {

    @Override
    public void fireproof() {
        System.out.println("防火功能");
    }

    @Override
    public void waterproof() {
        System.out.println("防盗功能");
    }
}
