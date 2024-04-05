public class SmsNotificationChannel implements INotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending notifications using SMS channel");
        System.out.println(message);
    }
}
