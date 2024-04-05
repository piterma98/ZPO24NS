public interface IAdvert {
    String getTranslatedText(String RecipientLocale);
    void choseNotificationChannel();
    void send(Recipient recipient);
}
