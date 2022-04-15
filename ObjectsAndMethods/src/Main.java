public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("bread" , 35 , 2 , 0.7);
        basket.print("       Содержимое корзины");
        Arithmetic arithmetic = new Arithmetic(2 , 5);
        arithmetic.launch();
        Printer stringQueue = new Printer();
        stringQueue.Appander("Главное в жизни - никогда не сдаваться. " , "Смысловая нагрузка " , 1);
        stringQueue.Appender("Капец всему " , "Лирика");
        stringQueue.Append(" Золушка");


    }
}
