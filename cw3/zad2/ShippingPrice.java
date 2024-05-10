public class ShippingPrice extends CartDecorator{
    public ShippingPrice(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", shipping";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5.0f;
    }
}
