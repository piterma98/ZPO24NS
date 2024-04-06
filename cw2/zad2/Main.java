import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Recipient janusz = new Recipient("Janusz", "janusz@poczta.pl", "500500500", "pl");
        Recipient mathew = new Recipient("Mathew", "mathew@mail.com", "123456789", "en");
        Recipient ferdek = new Recipient("Ferdek", "ferdek@poczta.pl", "654321789", "en");

        Advert ad_1 = new Advert(5.00, new HashMap<>() {{
            put("pl", "Jest dobrze");
            put("en", "It is good");
        }});
        Advert ad_2 = new Advert(500.00, new HashMap<>() {{
            put("pl", "Darmowy rowerek");
            put("en", "Free bicycle");
        }});
        Advert ad_3 = new Advert(500.00, new HashMap<>() {{
            put("pl", "Znizka na kebaba");
            put("en", "Kebab discount");
        }});
        ArrayList<Advert> adverts = new ArrayList<>();
        adverts.add(ad_1);
        adverts.add(ad_2);
        adverts.add(ad_3);
        ArrayList<Recipient> recipients = new ArrayList<>();
        recipients.add(janusz);
        recipients.add(mathew);
        recipients.add(ferdek);
        Recipient random_recipient = recipients.get(new Random().nextInt(recipients.size()));
        Advert random_advert = adverts.get(new Random().nextInt(adverts.size()));
        System.out.println("Recipient " + random_recipient.name + " locale " + random_recipient.getLocale());
        random_advert.send(random_recipient);
    }
}