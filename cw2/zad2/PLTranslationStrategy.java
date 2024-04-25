public class PLTranslationStrategy implements TranslationStrategy{
    @Override
    public String translate(String text) {
        return "Tłumaczenie na język polski:" + text;
    }
}
