public abstract class Item implements IItem {
    @Override
    public String getDescription() {
        return "Item";
    }

    @Override
    public double getPrice() {
        return 0.0f;
    }
    public Item addShipping(){
        return new Shipping(this);
    }
}
