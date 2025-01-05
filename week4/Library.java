package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
        System.out.println("Book added: " + title);
    }

    public boolean searchBook(String title) {
        return books.contains(title);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. View All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title to add: ");
                    String bookToAdd = scanner.nextLine();
                    library.addBook(bookToAdd);
                    break;
                case 2:
                    System.out.print("Enter the book title to search: ");
                    String bookToSearch = scanner.nextLine();
                    if (library.searchBook(bookToSearch)) {
                        System.out.println("The book \"" + bookToSearch + "\" is available in the library.");
                    } else {
                        System.out.println("The book \"" + bookToSearch + "\" is not available in the library.");
                    }
                    break;
                case 3:
                    List<String> books = library.getBooks();
                    System.out.println("\nBooks in the Library:");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (String book : books) {
                            System.out.println("- " + book);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
