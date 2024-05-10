public class Bread extends CartDecorator{
    public Bread(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", bread";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 2.0f;
    }
}
