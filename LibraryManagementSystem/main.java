package LibraryManagementSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String s;

        // Sample books
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        System.out.println("Welcome to the Library Management System!");

        do {
            System.out.println("\nCommands: ADD, DISPLAY, CHECKOUT, RETURN, EXIT");
            System.out.print("Enter command: ");
            s = scanner.nextLine().toUpperCase();

            switch (s) {
                case "ADD":
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case "DISPLAY":
                    library.displayBooks();
                    break;

                case "CHECKOUT":
                    System.out.print("Enter book title to check out: ");
                    title = scanner.nextLine();
                    library.checkOutBook(title);
                    break;

                case "RETURN":
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case "EXIT":
                    System.out.println("Exiting the library system.");
                    break;

                default:
                    System.out.println("Invalid command! Please try again.");
            }
        } while (!s.equals("EXIT"));

        scanner.close();
    }
}
