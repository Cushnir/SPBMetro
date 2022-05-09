public class ArithmeticCalculator {
    private int x = 0;
    private int y = 0;
    public final Operation arithmeicOperation;

    public ArithmeticCalculator(int x, int y, Operation arithmeicOperation) {
        this.x = x;
        this.y = y;
        this.arithmeicOperation = arithmeicOperation;
    }

    public void calculate(Operation arithmeicOperation) {
        if (arithmeicOperation == Operation.ADD) {
            int add = x + y;
            System.out.println(" сложения чисел = "+ add +"");
        } else if (arithmeicOperation == Operation.SUBTRACT) {
            int subtractX = x - y;
            System.out.println(" вычитания чисел = " + subtractX + "");
            int subtractY = y - x;
            System.out.println(" вычитания чисел = " + subtractY + "");
        } else if (arithmeicOperation == Operation.MULTIPLY) {
            double multiply = x * y;
            System.out.println(" произведения чисел = " + multiply + "");
        }
    }
}
