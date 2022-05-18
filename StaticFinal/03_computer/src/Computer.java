public class Computer {
    public CPU cpu;
    public RAM ram;
    public InformationAccumulator informationAccumulator;
    public Screen screen;
    public Keyboard keyboard;
    private final String vendor;
    private final String name;
    public static double totalWeight;
    public static String toString = "";


    public Computer(String vendor, String name, CPU cpu, RAM ram,
                    InformationAccumulator informationAccumulator,
                    Screen screen, Keyboard keyboard) {

        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationAccumulator = informationAccumulator;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void thisSetToString() {
        Computer.toString = Computer.toString + "\n" + vendor + " --> " + name + "";
    }

    public void setToString() {
        thisSetToString();
        cpu.setToString();
        ram.setToString();
        informationAccumulator.setToString();
        screen.setToString();
        keyboard.setToString();

    }

    public void setTotalWeight() {
        cpu.setTotalWeight();
        ram.setTotalWeight();
        informationAccumulator.setTotalWeight();
        screen.setTotalWeight();
        keyboard.setTotalWeight();
    }


    public static String getToString() {
        return toString;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static void clear() {
        toString = "";
        totalWeight = 0;
    }
}

