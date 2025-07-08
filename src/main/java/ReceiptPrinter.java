public class ReceiptPrinter {
    public void printReceipt(Book book, int quantity) {
        System.out.println("Book " + book.getTitle() + " has been ordered for " + quantity + " copies");
        System.out.println("Total Price = " + book.getPrice() * quantity);
    }
}
