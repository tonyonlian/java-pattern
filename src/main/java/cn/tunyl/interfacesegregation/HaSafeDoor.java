package cn.tunyl.interfacesegregation;

/**
 * 接口隔离
 * 使用三个接口代替一个接口申明三个方法，应为考虑到有的门没可能不同时具备防火、防水、防盗功能，可能只具备步分功能
 */
public class HaSafeDoor implements AntiTheft,Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗功能");
    }

    @Override
    public void fireproof() {
        System.out.println("防火功能");
    }

    @Override
    public void waterproof() {
        System.out.println("防水功能");
    }
}
