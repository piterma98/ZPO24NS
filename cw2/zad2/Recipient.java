public class Recipient {
    String name;
    private String locale;

    public Recipient(String name, String locale) {
        this.name = name;
        this.locale = locale;
    }
    public String getLocale(){
        return locale;
    }
}
