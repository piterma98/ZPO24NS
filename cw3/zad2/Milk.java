public class Milk extends CartDecorator{
    public Milk(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1.5f;
    }
}