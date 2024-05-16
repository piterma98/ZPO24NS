public class Main {

    public static void main(String[] args) {
        Item cart = new Cart();
        cart = new Beer(cart);
        cart = new Beer(cart);
        cart = new Beer(cart);
        cart = new Beer(cart);
        cart = new Bread(cart);
        cart = new Milk(cart);
        cart = new PendriveLeash(cart);
        cart = new ShopMascot(cart);
        cart = new Discount(cart);
        //We add shipping as last item
        cart = new ShippingPrice(cart);


        System.out.println(cart.getDescription());
        System.out.println(cart.getPrice());
    }
}