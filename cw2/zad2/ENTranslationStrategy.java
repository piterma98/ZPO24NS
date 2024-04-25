public class ENTranslationStrategy implements TranslationStrategy{
    @Override
    public String translate(String text) {
        return "Translation into english:" + text;
    }
}
