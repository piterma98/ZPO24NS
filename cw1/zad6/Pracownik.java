public class Pracownik {
    Pracowac pracowac;
    Dojezdzac dojezdzac;
    SpedzenieWolnegoCzasu spedzenieWolnegoCzasu;

    String zawod;

    public Pracownik(Pracowac pracowac, Dojezdzac dojezdzac, SpedzenieWolnegoCzasu spedzenieWolnegoCzasu, String zawod) {
        this.pracowac = pracowac;
        this.dojezdzac = dojezdzac;
        this.spedzenieWolnegoCzasu = spedzenieWolnegoCzasu;
        this.zawod = zawod;
    }
    public Pracownik(String zawod) {
        this.zawod = zawod;
    }
    public void methods(){
        System.out.println("Metody");
    }
}
