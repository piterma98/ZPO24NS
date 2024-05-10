public abstract class Pizza implements IPizza {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
    @Override
    public <T> Pizza removeDecorator(Class<T> decorator) {
        System.out.println("This object has no decorators!");
        return this;
    }
}