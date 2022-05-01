public class Book {
    private final String name;
    private final String author;
    private final int numerOfPages;
    private final int numerISBN;

    public Book(String name, String author, int numerOfPages, int numerISBN) {
        this.name = name;
        this.author = author;
        this.numerOfPages = numerOfPages;
        this.numerISBN = numerISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumerOfPages() {
        return numerOfPages;
    }

    public int getNumerISBN() {
        return numerISBN;
    }
}
