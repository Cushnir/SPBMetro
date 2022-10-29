import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public static int incomeCompany = 5_000_000 + (int) (Math.random() * 10_000_000);
    ArrayList<Employee> salarysEmployee = new ArrayList<>();
    ArrayList<Employee> topSalary = new ArrayList<>();
    ArrayList<Employee> lowSalary = new ArrayList<>();


    public void hire(Employee employee) {
        salarysEmployee.add(employee);

    }

    public void hireAll(ArrayList<Employee> employee) {
        salarysEmployee.addAll(employee);

    }

    public void fire(Employee employee) {
        salarysEmployee.remove(employee);

    }

    public int getIncome() {
        return incomeCompany;
    }


    public String toString() {
        return getClass().getName() + " Зароботная плата сотрудника = ";
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(salarysEmployee);
        for (int i = salarysEmployee.size() - 1; 0 < count; i--) {
            count--;
            topSalary.add(salarysEmployee.get(i));
        }
        return topSalary;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(salarysEmployee);
        for (int i = 0; i < count; i++) {
            lowSalary.add(salarysEmployee.get(i));
        }

        return lowSalary;
    }
    public void fireAll(){
        int fire = salarysEmployee.size() / 2;
        for (int i = 0; i < fire; i++) {
            salarysEmployee.remove(i);
        }
    }
}
