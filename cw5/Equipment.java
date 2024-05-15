import java.util.ArrayList;

public class Equipment implements Subject {
    ArrayList<Observer> observers;
    ArrayList<Item> items;

    public Equipment() {
        this.observers = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    @Override
    public void pickupItem(Item item) {
        this.items.add(item);
        notifyMissions();
    }

    @Override
    public void removeItem(Item item) {
        this.items.remove(item);
        notifyMissions();
    }

    @Override
    public void notifyMissions() {
        for (Observer observer : observers.stream().toList()) {
            observer.update(this.items);
        }
    }

    @Override
    public void registerMission(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeMission(Observer o) {
        observers.remove(o);
    }
}
