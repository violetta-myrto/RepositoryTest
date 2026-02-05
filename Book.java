public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private double price;

    public Book(String title, String author, String publisher, int yearOfPublication, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + yearOfPublication);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}
