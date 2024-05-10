public class Mozzarella extends PizzaDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", mozarella";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
