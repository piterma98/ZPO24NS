public class Recipient {
    String name;
    String email;
    String phone_number;
    private String locale;


    public Recipient(String name, String email, String phone_number, String locale) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.locale = locale;
    }

    public String getLocale(){
        return locale;
    }
}
