public class TopManager extends Operator {
    public int salary = 0;
    public int income  ;

    public TopManager(int fixSalary,int income) {
        super(fixSalary);
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
}
