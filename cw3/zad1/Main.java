public class Main {

    public static void main(String[] args) {

        Pizza margharita = new Margherita();
        margharita = new TomatoSauce(margharita);
        margharita = new Mozzarella(margharita);
        margharita = new Cheese(margharita);

        System.out.println(margharita.getPrice());
        System.out.println(margharita.getDescription());

        margharita = margharita.removeDecorator(Cheese.class);

        System.out.println(margharita.getPrice());
        System.out.println(margharita.getDescription());

        Pizza pepperoni = new Pepperoni();
        pepperoni = new TomatoSauce(pepperoni);
        pepperoni = new Cheese(pepperoni);
        pepperoni = new Salami(pepperoni);

        System.out.println(pepperoni.getPrice());
        System.out.println(pepperoni.getDescription());

        pepperoni = pepperoni.removeDecorator(Salami.class);

        System.out.println(pepperoni.getPrice());
        System.out.println(pepperoni.getDescription());

        Pizza capricciosa = new Capricciosa();
        capricciosa = new TomatoSauce(capricciosa);
        capricciosa = new Mozzarella(capricciosa);
        capricciosa = new Cheese(capricciosa);
        capricciosa = new Ham(capricciosa);

        System.out.println(capricciosa.getPrice());
        System.out.println(capricciosa.getDescription());

        capricciosa = capricciosa.removeDecorator(TomatoSauce.class);

        System.out.println(capricciosa.getPrice());
        System.out.println(capricciosa.getDescription());
    }
}