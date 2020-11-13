package Library_homework2;
import java.util.ArrayList;
import java.util.List;

public class Library {
    static List<Book> bookList = new ArrayList<Book>();

    static void addBook(Book b) {
        bookList.add(b);
        System.out.println("Added book: " + b.getTitle());
    }

    static void listBooks() {
        System.out.println("The list of the books in the library: ");
        for (Book books : bookList
        ) {
            System.out.println(" -- " + books.getTitle());
        }
    }

    static void deleteBook(Book b) {
        bookList.remove(b);
        System.out.println("Removed book: " + b.getTitle());
    }

    public static void main(String[] args) {
        Book b1 = new Novel("Bedtime Stories", 135, "children");
        Book b2 = new Novel("Midnight Mysteries", 257, "mystery");
        Book b3 = new Album("French Sculpture", 317, "premium");
        Book b4 = new Album("Ancient Art", 269, "Gloss coated");
        addBook(b1);
        addBook(b2);
        addBook(b3);
        addBook(b4);
        listBooks();
        deleteBook(b1);
        listBooks();
    }
}
