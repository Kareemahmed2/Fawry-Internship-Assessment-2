import java.util.ArrayList;
import java.util.List;

public class Inventory {
    ReceiptPrinter receiptPrinter;
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void buyBook(String ISBN, int quantity,String target) { //here I merged address and email into target parameter for extensibility of the code. More in README.md file
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println("Book " + book.getTitle() + " has been bought successfully.");
                receiptPrinter.printReceipt(book,quantity);
                book.buy(quantity,target);
                break;
            }
        }
    }

    public void removeOutdatedBooks() {
        books.removeIf(Book::isOutdated);
    }
}
