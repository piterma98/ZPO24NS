public class EmailNotificationChannel implements INotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending notifications using Email channel");
        System.out.println(message);
    }
}
