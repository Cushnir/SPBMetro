public class Main {

    public static void main(String[] args) {
        Basket kolea = new Basket();

        kolea.add("bread" , 35  , 5 ,0.7);
        kolea.add("milk " , 50  , 2 , 0.3);
        kolea.add("egg" , 2);
        kolea.add("water" , 5 , 2);
        kolea.print("       Содержимое корзины :");
        Basket vasea = new Basket();
        vasea.add("milk" , 50 , 10 , 0.3 );
        vasea.print("       Содержимое корзины :");
        System.out.println("Средняя цена корзин = " + Basket.getAverageBasketValue() + "");
        System.out.println("средняя цена товаров = " + Basket.getAveragePriceOfGoods() + "");
        Arithmetic arithmetic = new Arithmetic(7 , 5);
        arithmetic.launch();
        Printer stringQueue = new Printer();
        stringQueue.appander("Главное в жизни - никогда не сдаваться. " , "Смысловая нагрузка " , 1);
        stringQueue.appender("Капец всему " , "Лирика");
        stringQueue.appender(" Золушка");
    }
}
