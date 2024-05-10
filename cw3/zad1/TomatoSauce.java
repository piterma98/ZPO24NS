public class TomatoSauce extends PizzaDecorator{
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", tomato sauce";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
