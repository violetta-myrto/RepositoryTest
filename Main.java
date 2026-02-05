import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> stock = new ArrayList<>();
        stock.add(new Book("Clean Code", "Robert Martin", "PH", 2008, 45.99));
        stock.add(new Book("Effective Java", "Joshua Bloch", "AW", 2018, 55.50));

        while (true) {
            System.out.println("\n=== Bookstore E-Shop ===");
            System.out.println("1. Login as Customer");
            System.out.println("2. Login as Employee");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            if (choice == 0) break;

            if (choice == 1) {
                Customer customer = new Customer("Customer");
                int cChoice;
                do {
                    customer.showMenu();
                    cChoice = sc.nextInt();

                    if (cChoice == 1) {
                        customer.browseBooks(stock);
                    } else if (cChoice == 2) {
                        customer.browseBooks(stock);
                        System.out.print("Select book number: ");
                        int index = sc.nextInt() - 1;
                        if (index >= 0 && index < stock.size()) {
                            customer.buyBook(stock.get(index));
                        }
                    } else if (cChoice == 3) {
                        customer.checkout();
                    }
                } while (cChoice != 0);
            }

            else if (choice == 2) {
                Employee employee = new Employee("Employee");
                int eChoice;
                do {
                    employee.showMenu();
                    eChoice = sc.nextInt();

                    if (eChoice == 1) {
                        for (int i = 0; i < stock.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            stock.get(i).displayBook();
                        }
                    } else if (eChoice == 2) {
                        sc.nextLine(); // clear buffer
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Author: ");
                        String author = sc.nextLine();
                        System.out.print("Publisher: ");
                        String publisher = sc.nextLine();
                        System.out.print("Year: ");
                        int year = sc.nextInt();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        employee.addBook(stock,
                                new Book(title, author, publisher, year, price));
                    } else if (eChoice == 3) {
                        for (int i = 0; i < stock.size(); i++) {
                            System.out.println((i + 1) + ". " + stock.get(i).getTitle());
                        }
                        System.out.print("Select book to remove: ");
                        int index = sc.nextInt() - 1;
                        employee.removeBook(stock, index);
                    }
                } while (eChoice != 0);
            }
        }

        sc.close();
        System.out.println("Goodbye!");
    }
}
