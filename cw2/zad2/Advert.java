import java.util.Map;
import java.util.Objects;

public class Advert implements IAdvert{
    Double price;
    private INotificationChannel notificationChannel;
    public Advert(Double price) {
        this.price = price;
    }

    private Translator getTranslator(String locale) {
        if(Objects.equals(locale, "pl")){
            return new Translator(new PLTranslationStrategy());
        }
        else if(Objects.equals(locale, "en")){
            return new Translator(new ENTranslationStrategy());
        }
        else if(Objects.equals(locale, "de")){
            return new Translator(new DETranslationStrategy());
        }
        else{
            System.out.println("Not translation strategy found for this locale");
            return null;
        }
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
        Translator translator = this.getTranslator(recipient.getLocale());
        this.notificationChannel.send(translator, recipient);
    }
}
