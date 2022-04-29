public class Arithmetic {
    public int x = 0;
    public int y = 0;

    public void launch (){
        this.sum (x , y);
        this.work(x , y);
        this.comparison(x ,y);
    }
    public Arithmetic(int firstNumber, int secondNumer) {
        x = firstNumber;
        y = secondNumer;
    }
    public void comparison(int x, int y) {
        int max = 0;
        int min = 0;
        if (x >= y) {
            max = x;
            min = y;
            System.out.println("Максимальное число = " + max + "");
            System.out.println("Минимальное число = " + min + "");
        } else {
            max = y;
            min = x;
            System.out.println("Максимальное число = " + max + "");
            System.out.println("Минимальное число = " + min + "");
        }
    }

    public void sum(int x, int y) {
        int sum = x + y;
        System.out.println("          Действие с числами :");
        System.out.println("Сумма чисел = " + sum + "");
    }

    public void work(int x, int y) {
        int work = x * y;
        System.out.println("Произведение чисел = " + work + "");
    }

}
