public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
