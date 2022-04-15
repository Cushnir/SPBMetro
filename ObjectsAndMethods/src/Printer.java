public class Printer {
    public String text = "";
    public  String name = "";
    public int numerOfPages = 0;
    public int allPages = 1;
    public  int allPrintedPage = 0 ;

    public void Append(String text){
        this.text = text;
        System.out.println("Текст для печати :\n"+text+"");
        System.out.println("Название данного текста: "+name+"");
        System.out.println("Общее количество страниц = "+allPages+"");
        WorkDone(allPages);
        System.out.println("Количество напечатанных страниц за все время работы = "+allPrintedPage+"");
    }
    public void  Appender(String text ,String name ){
        this.name = name;
        this.Append(text);

    }
    public void  Appander(String text ,String name ,int numerOfPages){
        this.Appender(text , name);
        this.numerOfPages = numerOfPages;
    }
    public int getPendingPagesCount(int numerOfPages){
        this.allPages = this.allPages + numerOfPages;
        return allPages;
    }
    public int WorkDone(int allPages) {
        this.allPrintedPage = allPrintedPage + allPages;
        return allPrintedPage;
    }
    public void Claer(){
        this.text = "";
        this.name = "";
        this.numerOfPages = 0;
    }

}
