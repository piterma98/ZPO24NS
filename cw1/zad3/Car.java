public class Car implements ICar{
    public String name;
    public int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getCarName() {
        return this.name;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
