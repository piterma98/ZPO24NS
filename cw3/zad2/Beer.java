public class Beer extends CartDecorator{
    public Beer(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", beer";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
