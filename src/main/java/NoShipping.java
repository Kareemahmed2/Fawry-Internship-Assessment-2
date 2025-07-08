public class NoShipping implements ShippingMethods {
    @Override
    public void delivery(Book book, int quantity,String target) {
        return;
    }
}
