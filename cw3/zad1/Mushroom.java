public class Mushroom extends PizzaDecorator{
    public Mushroom(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", mushroom";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 13.0f;
    }
}
