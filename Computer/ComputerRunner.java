package Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.load();
        System.out.println("SSD" + computer.ssd);
        System.out.println("RAM" + computer.ram);
    }
}
