public class Printer {
    public String text = "";
    public String name = "";
    public int numerOfPages = 0;
    public int allPages = 1;
    public int allPrintedPage = 0;

    public void appender(String text) {
        this.text = text;
        print();
        claer();
    }

    public void appender(String text, String name) {
        this.name = name;
        appender(text);
    }

    public void appander(String text, String name, int numerOfPages) {
        this.numerOfPages = numerOfPages;
        appender(text , name );
    }

    public int getPendingPagesCount(int numerOfPages) {
        this.allPages = this.allPages + numerOfPages;
        return allPages;
    }

    public int workDone(int allPages) {
        this.allPrintedPage = allPrintedPage + allPages;
        return allPrintedPage;
    }

    public void print() {
        System.out.println("Текст для печати :\n" + text + "");
        System.out.println("Название данного текста: " + name + "");
        System.out.println("Общее количество страниц = " + numerOfPages + "");
        workDone(allPages);
        getPendingPagesCount(allPrintedPage);
        System.out.println("Количество напечатанных страниц за все время работы = " + allPrintedPage + "");
    }

    public void claer() {
        this.text = "";
        this.name = "";
        this.allPages = 1;
    }
}
