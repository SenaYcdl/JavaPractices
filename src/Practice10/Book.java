package Practice10;

public class Book {

    String name;
    String author;

    @Override
    public String toString() {
        return "Book" +
                "\nname=" + name +
                "\nautor=" + author +
                "\nyear=" + year +
                "\npage=" + page;
    }

    public Book(String name, String autor, int year) {
        this.name = name;
        this.author = autor;
        this.year = year;
    }

    int year;
    int page;


    public Book(String name, String autor) {
        this.name = name;
        this.author = autor;
    }

    public Book(String name, String autor, int year, int page) {
        this.name = name;
        this.author = autor;
        this.year = year;
        this.page = page;
    }

    public Book() {
    }
}
