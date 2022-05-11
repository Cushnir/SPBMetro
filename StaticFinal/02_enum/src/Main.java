public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator( 5 , 10 , Operation.ADD );
        System.out.println("Результат : ");
        System.out.println();
        arithmeticCalculator.calculate(Operation.MULTIPLY);
    }
}


