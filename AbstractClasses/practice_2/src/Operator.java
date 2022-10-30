public class Operator implements Employee {
    public  int fixSalary;

    public Operator(int fixSalary) {
        this.fixSalary = fixSalary;
    }


    public int getMonthSalary() {
        return fixSalary;
    }


    @Override
    public String toString (){
        return "\n" + getClass().getName() + " Зароботная плата сотрудника = " + getMonthSalary();
    }
}
