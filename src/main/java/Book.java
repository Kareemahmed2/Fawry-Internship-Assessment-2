public class Book {

    private String ISBN;
    private String title;
    private int publishYear;
    private String Author;
    private int price;
    private ShippingMethods shippingMethods;

    public Book(String ISBN, String author,String title, int publishYear, int price) {
        this.ISBN = ISBN;
        this.title = title;
        this.Author = author;
        this.publishYear = publishYear;
        this.price = price;
    }
    public Book(){}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ShippingMethods getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(ShippingMethods shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public int buy(int quantity,String target) {
        shippingMethods.delivery(this,quantity,target);
        return price*quantity;
    }

    public Boolean isOutdated(){
        return this.publishYear < 2015;
    }
}

