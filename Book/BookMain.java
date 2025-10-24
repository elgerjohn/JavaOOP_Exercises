
package Book;

public class BookMain {
    public static void main(String[] args) {
       
        Book book1 = new Book("Chess Fundamentals", "José Raúl Capablanca", "978-1-59315-063-0");
        Book book2 = new Book("Modern Chess Openings", "Nick de Firmian", "978-1-84744-259-7");
        Book book3 = new Book("Think Like a Grandmaster", "Alexander Kotov", "978-0-89561-048-9");

      
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        Book.displayAllBooks();


        Book.removeBook("978-0-89561-048-9");

    
        Book.displayAllBooks();
    }
}
