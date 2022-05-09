public class Basket {
    private static int totalBasketValue = 0;
    private static int totalNumerOfGoods = 0;
    private static int totalNumerOfBaskets = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private int count = 0;
    public Basket() {
        totalNumerOfBaskets = totalNumerOfBaskets + 1 ;
        items = "Список товаров:";
        this.limit = 1000000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public static void setTotalNumerOfGoods(int count){
        totalNumerOfGoods = totalNumerOfGoods + count;
    }
    public static int getTotalNumerOfGoods(){
        return totalNumerOfGoods;
    }
    public static void setTotalBasketValue(int totalPrice){
        totalBasketValue = totalBasketValue + totalPrice;
    }
    public  static  int getTotalBasketValue(){
        return totalBasketValue;
    }
    public static double getAveragePriceOfGoods() {
            double averagePriceOfGoods = totalBasketValue / totalNumerOfGoods;
            return averagePriceOfGoods;
        }

    public static double getAverageBasketValue(){
        double averageBasketValue = totalBasketValue / totalNumerOfBaskets;
        return averageBasketValue;
    }



    public void add(String name, int price) {
        add(name, price, 1 , 0.1);
    }
    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price +  "\n " + weight + "kg.";
        totalPrice = totalPrice + ( count * price ) ;
        totalWeight = totalWeight + (weight * count);
        this.count = this.count + count;
        setTotalNumerOfGoods(count);

    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public void add(String name, int price, int count) {
        add(name, price, count , 0.1);
    }
    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }
    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println();
            System.out.println("Масса указанных товаров = " + totalWeight + " kg");
            setTotalBasketValue(totalPrice);
            getAverageBasketValue();
            getAveragePriceOfGoods();
        }
    }
}