import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Company topHolding = new Company();
        ArrayList<Employee> topHoldings = new ArrayList<>();
        Collections.sort(topHoldings);
        for (int i = 0; i < 180 ; i++) {
            topHolding.hire(new Manager(50000));
        }
        System.out.println("Штат сотрудников = "+ topHolding.salarysEmployee.size());
        System.out.println("Штат сотрудников = "+ topHolding.salarysEmployee.size());

        System.out.println(topHolding.getTopSalaryStaff(7));

        System.out.println(topHolding.getLowestSalaryStaff(5));
    }
}
