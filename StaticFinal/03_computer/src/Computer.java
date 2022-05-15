import javax.swing.plaf.ScrollPaneUI;
import javax.xml.namespace.QName;

public class Computer {
    private final String vendor;
    private final String name;
    public static double totalWeight;
    public static String toString;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
        setToString();
    }

    public void setToString() {
         Computer.toString = Computer.toString + "\n" + vendor +" --> " + name +"";
    }
}

