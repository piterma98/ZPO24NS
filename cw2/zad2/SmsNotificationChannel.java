public class SmsNotificationChannel implements INotificationChannel {

    @Override
    public void send(String message, Recipient recipient) {
        System.out.println("Sending notifications using SMS channel to: " +recipient.phone_number);
        System.out.println(message);
    }
}
