public class DETranslationStrategy implements TranslationStrategy{
    @Override
    public String translate(String text) {
        return "deutsche Übersetzung:" + text;
    }
}
