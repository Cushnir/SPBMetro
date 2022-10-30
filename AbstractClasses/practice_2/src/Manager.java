public class Manager implements Employee {
    public final int incomeManager;
    public int salary;
    public final int fixSalary;

    public Manager(int fixManager) {
        this.fixSalary = fixManager;
        incomeManager = 115_000 + (int) (Math.random() * 25_000);
    }

    @Override
    public int getMonthSalary() {
        salary = fixSalary + (int) (incomeManager * 0.05);
        return salary;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + " Зароботная плата сотрудника = " + getMonthSalary();
    }
}
