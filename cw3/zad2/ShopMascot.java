public class ShopMascot extends CartDecorator{
    public ShopMascot(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", shop mascot";
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
