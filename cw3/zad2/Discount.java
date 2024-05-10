public class Discount extends CartDecorator{
    public Discount(Item item) {
        super(item);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", discount";
    }
    @Override
    public double getPrice() {
        double price = super.getPrice() - 10.0f;
        if(price<0.0f){
            return 0.0f;
        }
        return price;
    }
}