public abstract class PrawoPodatkowe implements IPrawoPodatkowe {
    public double StawkaPodatku;

    public PrawoPodatkowe(double stawkaPodatku) {
        StawkaPodatku = stawkaPodatku;
    }

    @Override
    public double getStawkaPodatku() {
        return this.StawkaPodatku;
    }
}
