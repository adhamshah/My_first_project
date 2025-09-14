import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrow();
                System.out.println("You have borrowed: " + title);
                return;
            }
        }
        throw new Exception("Book not found: " + title);
    }

    public void returnBook(String title) throws Exception {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("You have returned: " + title);
                return;
            }
        }
        throw new Exception("Book not found: " + title);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}