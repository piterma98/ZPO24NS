// TTS means Text to speech
public class TTSNotificationChannel implements INotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending notifications using TTS channel");
        System.out.println(message);
    }
}
