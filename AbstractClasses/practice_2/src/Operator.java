public class Operator implements Employee {
    public final int fixSalary;

    public Operator(int fixSalary) {
        this.fixSalary = fixSalary;
    }


    public int getMonthSalary() {
        return fixSalary;
    }

    @Override
    public int compareTo(Object o) {
        Operator operators = (Operator) o;
        return Integer.compare(getMonthSalary(),operators.getMonthSalary());
    }
    @Override
    public String toString (){
        return getClass().getName() + "Зароботная плата сотрудника = " + getMonthSalary();
    }
}
