import java.util.ArrayList;

public class Sklep implements ISklep{
    ArrayList<Klient> ListaKlientow;

    public Sklep(ArrayList<Klient> listaKlientow) {
        ListaKlientow = listaKlientow;
    }

    @Override
    public void printKlientsStawkaPodatku() {
        for (Klient klient : ListaKlientow) {
            System.out.println(klient.getStawkaPodatkowa());
        }
    }
}
