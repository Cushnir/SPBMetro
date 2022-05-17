import javax.swing.plaf.ScrollPaneUI;
import javax.xml.namespace.QName;

public class Computer {
    public CPU cpu;
    public RAM ram;
    public InformationAccumulator informationAccumulator;
    public Screen screen;
    public Keyboard keyboard;
    private final String vendor;
    private final String name;
    public static double totalWeight;
    public static String toString;

    public  Computer (String vendor ,String name ){
        this.vendor = vendor;
        this.name = name;
        setToString();
    }
    public Computer(String vendor, String name , CPU cpu , RAM ram , InformationAccumulator informationAccumulator ,
                    Screen screen , Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationAccumulator = informationAccumulator;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void setToString() {
        Computer.toString = Computer.toString + "\n" + vendor + " --> " + name + "";
    }

    public void setCPU(double freguensyCPU, int numerOfCoresCPU, String manufacturerCPU, double theWeightCPU) {
        cpu.setFreguensyCPU(freguensyCPU);
        cpu.seNumerOfCOresCPU(numerOfCoresCPU);
        cpu.setManufacturerCPU(manufacturerCPU);
        cpu.setTheWeightCPU(theWeightCPU);
    }

    public void setRam(RamType typeRAM, double volumeRAM, double weightRAM) {
        ram.setTypeRAM(typeRAM);
        ram.setVolumeRAM(volumeRAM);
        ram.setWeightRAM(weightRAM);
    }

    public void setInformationAccumulator(TypeInformationAccumulator typeInformationAccumulator,
                                          double volumeInformationAccumulator,
                                          double weightInformationAccumulator) {
        informationAccumulator.setTypeInformationAccumulator(typeInformationAccumulator);
        informationAccumulator.setVolumeInformationAccumulator(volumeInformationAccumulator);
        informationAccumulator.setWeightInformationAccumulator(weightInformationAccumulator);
    }
    public void  setScreen(double diagonalScreen , TypeScreen typeScreen , double weightScreen){
        screen.setDiagonalScreen(diagonalScreen);
        screen.setTypeScreen(typeScreen);
        screen.setWeightScreen(weightScreen);
    }
    public void setKeyboardet(String typeKeyboard , Backlight keyboardBackLight , double weightKeyboard){
         keyboard.setTypeKeyboard(typeKeyboard);
         keyboard.setKeyboardBackLight(keyboardBackLight);
         keyboard.setWeightKeyboard(weightKeyboard);
    }
}

