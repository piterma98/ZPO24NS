class Translator {
    private TranslationStrategy strategy;

    public Translator(TranslationStrategy strategy) {
        this.strategy = strategy;
    }

    public String translate(String text) {
        return strategy.translate(text);
    }

    public void setStrategy(TranslationStrategy strategy) {
        this.strategy = strategy;
    }
}