public class TopManager implements Employee {
    public int salary;
    public final int income;
    public final int fixSalary;

    public TopManager(int fixSalary, int income) {
        this.fixSalary = fixSalary;
        this.income = income;


    }

    @Override
    public int getMonthSalary() {
        if (income > 10_000_000) {
            salary = fixSalary + (int) (fixSalary * 1.5);
        } else {
            return fixSalary;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + " Зароботная плата сотрудника = " + getMonthSalary();
    }
}
