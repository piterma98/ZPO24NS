public class Ham extends PizzaDecorator{
    public Ham(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", ham";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
