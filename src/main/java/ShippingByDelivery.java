public class ShippingByDelivery implements ShippingMethods {
    private ShippingService shippingService=new ShippingService(); //if it was springboot, I would use dependency injection or autowiring here

    @Override
    public void delivery(Book book, int quantity,String target) {
        shippingService.shipBook(book,quantity,target);
    }
}
