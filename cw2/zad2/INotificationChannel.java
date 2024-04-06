public interface INotificationChannel {
    void send(String message, Recipient recipient);
}
