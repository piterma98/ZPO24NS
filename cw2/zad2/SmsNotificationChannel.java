public class SmsNotificationChannel implements INotificationChannel {

    @Override
    public void send(Translator translator, Recipient recipient) {
        System.out.println("Sending notifications using SMS channel to: " +recipient.phone_number);
    }
}
