public class ShippingByEmail implements ShippingMethods{
    private MailService mailService=new MailService();
    @Override
    public void delivery(Book book, int quantity,String target) {
        mailService.sendEmail(book,quantity,target);
    }
}
