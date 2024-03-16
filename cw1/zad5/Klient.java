public class Klient implements IKlient {
    PrawoPodatkowe prawoPodatkowe;

    public Klient(PrawoPodatkowe prawoPodatkowe) {
        this.prawoPodatkowe = prawoPodatkowe;
    }

    @Override
    public double getStawkaPodatkowa() {
        return this.prawoPodatkowe.StawkaPodatku;
    }
}
