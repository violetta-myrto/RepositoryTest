import java.util.ArrayList;

public class Employee extends User {

    public Employee(String name) {
        super(name);
    }

    public void addBook(ArrayList<Book> stock, Book book) {
        stock.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(ArrayList<Book> stock, int index) {
        if (index >= 0 && index < stock.size()) {
            System.out.println(stock.get(index).getTitle() + " removed.");
            stock.remove(index);
        } else {
            System.out.println("Invalid selection.");
        }
    }

    @Override
    public void showMenu() {
        System.out.println("\nEmployee Menu");
        System.out.println("1. View stock");
        System.out.println("2. Add book");
        System.out.println("3. Remove book");
        System.out.println("0. Logout");
    }
}
