package Library;

public class LibraryMain {
     public static void main(String[] args) {
       
        Library book1 = new  Library("Chess Fundamentals", "José Raúl Capablanca", "978-1-59315-063-0");
         Library book2 = new  Library("Modern Chess Openings", "Nick de Firmian", "978-1-84744-259-7");
        Library book3 = new  Library("Think Like a Grandmaster", "Alexander Kotov", "978-0-89561-048-9");

      
       Library.addBook(book1);
         Library.addBook(book2);
        Library.addBook(book3);

        Library.displayAllBooks();


 Library.removeBook("978-0-89561-048-9");

    
        Library.displayAllBooks();
    }
}
