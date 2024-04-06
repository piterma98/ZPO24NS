import java.util.Map;

public class Advert implements IAdvert{
    Double price;
    private INotificationChannel notificationChannel;
    Map<String, String> localized_text_dict;

    public Advert(Double price, Map<String, String> localized_text_dict) {
        this.price = price;
        this.localized_text_dict = localized_text_dict;
    }

    @Override
    public String getTranslatedText(String recipientLocale){
        return this.localized_text_dict.get(recipientLocale);
    }
    @Override
    public void choseNotificationChannel() {
        System.out.println(price);
        if (price < 10) {
            this.notificationChannel = new EmailNotificationChannel();
        } else if (price <= 100) {
            this.notificationChannel = new SmsNotificationChannel();
        } else{
            this.notificationChannel = new TTSNotificationChannel();
        }
    }
    @Override
    public void send(Recipient recipient){
        this.choseNotificationChannel();
        String message = this.getTranslatedText(recipient.getLocale());
        this.notificationChannel.send(message, recipient);
    }
}
