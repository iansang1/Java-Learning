
public class BookTest {

    public static void main(String[] args) {

        // Create a Book object.
        Book book1 = new Book("Java Programming", "John Smith", 1500);

        // Display book information.
        book1.displayBookInfo();

        // Borrow the book.
        book1.borrowBook();

        // Display updated information.
        book1.displayBookInfo();

        // Return the book.
        book1.returnBook();

        // Display final information.
        book1.displayBookInfo();
    }
}
