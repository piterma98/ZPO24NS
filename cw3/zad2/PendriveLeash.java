public class PendriveLeash extends CartDecorator{
    public PendriveLeash(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", pendrive leash";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1.0f;
    }
}
