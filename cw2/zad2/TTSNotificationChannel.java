// TTS means Text to speech
public class TTSNotificationChannel implements INotificationChannel{
    @Override
    public void send(String message, Recipient recipient) {
        System.out.println("Sending notifications using TTS channel to " + recipient.phone_number);
        System.out.println(message);
    }
}
