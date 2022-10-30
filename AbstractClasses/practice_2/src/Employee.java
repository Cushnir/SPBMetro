import java.util.ArrayList;
import java.util.List;

public interface Employee extends Comparable {


    public int getMonthSalary();
    @Override
    public default int compareTo(Object o) {
        Employee employee = (Employee) o;
        return Integer.compare(getMonthSalary(),employee.getMonthSalary());
    }

}

