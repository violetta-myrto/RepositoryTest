import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Book> cart = new ArrayList<>();

    public Customer(String name) {
        super(name);
    }

    public void browseBooks(ArrayList<Book> stock) {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < stock.size(); i++) {
            System.out.print((i + 1) + ". ");
            stock.get(i).displayBook();
        }
    }

    public void buyBook(Book book) {
        cart.add(book);
        System.out.println(book.getTitle() + " added to cart.");
    }

    public void checkout() {
        double total = 0;
        System.out.println("\nYour Cart:");
        for (Book b : cart) {
            System.out.println("- " + b.getTitle() + " $" + b.getPrice());
            total += b.getPrice();
        }
        System.out.println("Total: $" + total);
    }

    @Override
    public void showMenu() {
        System.out.println("\nCustomer Menu");
        System.out.println("1. Browse books");
        System.out.println("2. Buy book");
        System.out.println("3. Checkout");
        System.out.println("0. Logout");
    }
}
