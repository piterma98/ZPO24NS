public class EmailNotificationChannel implements INotificationChannel {
    @Override
    public void send(Translator translator, Recipient recipient) {
        System.out.println("Sending notifications using Email channel to " + recipient.email);
    }
}
