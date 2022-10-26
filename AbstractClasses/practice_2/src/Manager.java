public class Manager extends Operator {
    public final int incomeManager;
    public int salary = 0;

    public Manager(int fixManager) {
        super(fixManager);
        incomeManager = 115_000 + (int) (Math.random() * 25_000);
    }

    @Override
    public int getMonthSalary() {
        salary = fixSalary + (int) (incomeManager * 0.05);
        return salary;
    }
}
