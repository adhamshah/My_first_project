import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding some books to the library
        library.addBook(new Book("Haneef naam", "Dr Haneef shareef"));
        library.addBook(new Book("Paak en Maher", "Doli baigh"));
        library.addBook(new Book("Murgh pa kudhu a raptaga", "Mubarak Qazi"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    // Display Books
                    library.displayBooks();
                    break;

                case 3:
                    // Borrow Book
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    try {
                        library.borrowBook(borrowTitle);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    // Return Book
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    try {
                        library.returnBook(returnTitle);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    // Search Book
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Found: " + foundBook);
                    } else {
                        System.out.println("No book found with the title: " + searchTitle);
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }//end of switch case
        }//end of while loop
    }//end of main method
}// end of class 