public class EmailNotificationChannel implements INotificationChannel {
    @Override
    public void send(String message, Recipient recipient) {
        System.out.println("Sending notifications using Email channel to " + recipient.email);
        System.out.println(message);
    }
}
