public class Library {

    BookRepository repository;
    void addBook(Book book);
    void removeBook(String isbn);
    Book findBook(String isbn);
    List<Book> listAllBooks();
}
