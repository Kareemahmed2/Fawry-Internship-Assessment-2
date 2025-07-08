public class ShippingService {
    public void shipBook(Book book, int quantity,String target) {
        System.out.println("Book " + book.getTitle() + " has been shipped successfully to "+target+ " for " + quantity + " copies.");
    }
}
