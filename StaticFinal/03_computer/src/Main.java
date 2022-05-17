public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer" , "Nitro 5" );
        CPU cpu = new CPU(3.6 ,8 , "Intel" , 0.2);
        RAM ram = new RAM(RamType.DDR4 , 16.0 , 0.1);
        InformationAccumulator informationAccumulator = new InformationAccumulator( TypeInformationAccumulator.SSD ,
                1.0 ,0.6);
        Screen screen = new Screen(20.0 , TypeScreen.IPS , 3.0);
        Keyboard keyboard = new Keyboard("Механическая" , Backlight.YES , 0.4);
        System.out.println(Computer.toString);
        System.out.println("Общая масса комплектующих = " +Computer.totalWeight + "кг");

    }
}
