public class ArithmeticCalculator {
    private int x = 0;
    private int y = 0;
    public final Operation arithmeticOperation;

    public ArithmeticCalculator(int x, int y, Operation.arithmeticOperation) {
        this.x = x;
        this.y = y;
        this.arithmeticOperation = arithmeticOperation;
    }

    public void calculate(Operation.arithmeticOperation) {
        if (arithmeticOperation == Operation.ADD) {
            int add = x + y;
            System.out.println("сложение чисел = " + add + "");
        } else if (arithmeticOperation == Operation.SUBTRACT) {
            int subtractX = x - y;
            System.out.println("вычитания чисел = " + subtractX + "");
            int subtractY = y - x;
            System.out.println("вычитания чисел = " + subtractY + "");
        } else if (arithmeticOperation == Operation.MULTIPLY) {
            int multiply = x * y;
            System.out.println("произведения чисел = " + multiply + "");
        }
    }
}
