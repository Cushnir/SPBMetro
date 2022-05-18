public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(3.6, 8, "Intel", 0.2);
        RAM ram = new RAM(RamType.DDR4, 16.0, 0.1);
        InformationAccumulator informationAccumulator = new InformationAccumulator(TypeInformationAccumulator.SSD,
                1.0, 0.6);
        Screen screen = new Screen(20.0, TypeScreen.IPS, 3.0);
        Keyboard keyboard = new Keyboard("Механическая", Backlight.YES, 0.4);
        Computer computer = new Computer("Acer", "Nitro 5",
                cpu, ram, informationAccumulator, screen,
                keyboard);
        computer.setTotalWeight();
        computer.setToString();
        System.out.println(Computer.toString);
        System.out.println("Общая масса комплектующих = " + Computer.totalWeight + "кг");
        Computer.clear();
        computer.cpu = new CPU(2.8, 6, "AMD", 0.3);
        computer.setTotalWeight();
        computer.setToString();
        System.out.println();
        System.out.println("Последняя комплектация: ");
        System.out.println(computer.getToString());
        System.out.println("Macca комлектующих = " + computer.getTotalWeight() + "кг");
    }
}
