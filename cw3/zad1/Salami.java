public class Salami extends PizzaDecorator{
    public Salami(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", salami";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
