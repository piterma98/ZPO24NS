public interface IPizza {
    String getDescription();
    double getPrice();
    <T> Pizza removeDecorator(Class<T> decorator);
}