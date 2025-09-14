class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() throws Exception {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new Exception("Book is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Not Available)");
    }
}