public class Main {
    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService();
        MailService mailService = new MailService();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();

        // Inventory setup
        Inventory inventory = new Inventory();
        inventory.receiptPrinter = receiptPrinter;

        // Paper Book
        PaperBook paperBook = new PaperBook();
        paperBook.setISBN("PB001");
        paperBook.setTitle("Sherlock Holmes");
        paperBook.setAuthor("Arthur Conan Doyle");
        paperBook.setPrice(250);
        paperBook.setPublishYear(2010);
        paperBook.setStock(5);
        paperBook.setShippingMethods(new ShippingByDelivery());

        // EBook
        EBook ebook = new EBook();
        ebook.setISBN("EB001");
        ebook.setTitle("Effective Java");
        ebook.setAuthor("Ahmed Mohamed");
        ebook.setPrice(150);
        ebook.setPublishYear(2018);
        ebook.setFileType("PDF");
        ebook.setShippingMethods(new ShippingByEmail());

        // Demo Book
        DemoBook demo = new DemoBook();
        demo.setISBN("DM001");
        demo.setTitle("Java Basics");
        demo.setAuthor("Kareem Ahmed");
        demo.setPrice(0);
        demo.setPublishYear(2020);

        inventory.addBook(paperBook);
        inventory.addBook(ebook);
        inventory.addBook(demo);

        System.out.println("Test: Buy Paper Book");
        inventory.buyBook("PB001", 2, "123 Main Street");

        System.out.println();

        System.out.println("Test: Buy EBook");
        inventory.buyBook("EB001", 1, "user@example.com");

        System.out.println();

        System.out.println("Test: Buy Demo Book");
        inventory.buyBook("DM001", 1, "test@example.com");

        System.out.println();

        System.out.println("Test: Remove Outdated Books");
        inventory.removeOutdatedBooks();
        System.out.println("Outdated books removed.");
    }
}
