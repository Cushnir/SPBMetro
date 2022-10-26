import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> topHolding = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            topHolding.add(new Manager(50000));
        }
        for (int i = 0; i < 10; i++) {
            topHolding.add(new TopManager(70000));
        }
        for (int i = 0; i < 180; i++) {
            topHolding.add(new Operator(30000));
        }
        Collections.sort(topHolding);
        for (Employee employee : topHolding) {
            System.out.println(employee);
        }
        System.out.println("Штат сотрудников = "+ topHolding.size());
        for (int i = 0; i == (topHolding.size() / 2); i++) {
            topHolding.remove(topHolding.get(i));
        }
        for (Employee employee : topHolding) {
            System.out.println(employee);

        }
        System.out.println("Штат сотрудников ="+ topHolding.size());
    }
}
