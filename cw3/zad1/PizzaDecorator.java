public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public <T> Pizza removeDecorator(Class<T> decorator) {
        PizzaDecorator temp = this;
        if (getClass() == decorator) {
            return pizza;
        }
        while (decorator != temp.pizza.getClass()) {
            temp = (PizzaDecorator) temp.pizza;
        }
        if (temp.pizza.getClass() == Pizza.class) {
            System.out.println("Object not decorated with " + decorator);
            return this;
        }
        PizzaDecorator nextDecorator = (PizzaDecorator) temp.pizza;
        temp.pizza = nextDecorator.pizza;
        return this;
    }
}
