public class MailService {
    public void sendEmail(Book book,int quantity,String email) {
        System.out.println("Book " + book.getTitle() + " has been sent to " + email+ " email for " + quantity + " copies.");
    }
}
