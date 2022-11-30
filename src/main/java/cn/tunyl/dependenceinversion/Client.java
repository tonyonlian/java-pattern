package cn.tunyl.dependenceinversion;


/**
 * 依赖倒转原则 Dependence Inversion Principle
 */
public class Client {
    public static void main(String[] args) {
        HardDisk hardDisk = new XijieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);

    }
}
