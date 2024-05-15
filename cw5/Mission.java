import java.util.ArrayList;
import java.util.List;

public class Mission implements Observer {
    private Subject equipment;
    private Item required_item;
    private int required_item_quantity;

    public Mission(Subject equipment, Item item, Integer required_item_quantity) {
        this.equipment = equipment;
        this.required_item = item;
        this.required_item_quantity = required_item_quantity;
        equipment.registerMission(this);
    }

    public String getItemName(){
        return this.required_item.name;
    }

    @Override
    public void update(ArrayList<Item> item) {
        List<Item> filtered_items_from_equipment = item.stream().filter(p -> p.getClass() == required_item.getClass()).toList();
        if (filtered_items_from_equipment.size() == this.required_item_quantity) {
            System.out.println("Required item " + getItemName() + " quantity acquired, mission complete!");
            this.equipment.removeMission(this);
        }
    }
}
