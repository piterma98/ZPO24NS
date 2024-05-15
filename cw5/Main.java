public class Main {

    public static void main(String[] args) {
        Equipment equipment = new Equipment();
        Item mission_1_item = new Item("Rock");
        Item mission_2_item = new Item("Gold");
        Mission mission_1 = new Mission(equipment, mission_1_item, 2);
        Mission mission_2 = new Mission(equipment, mission_2_item, 5);
        equipment.pickupItem(mission_1_item);
        equipment.pickupItem(mission_1_item);
        equipment.pickupItem(mission_2_item);
        equipment.pickupItem(mission_2_item);
        equipment.removeItem(mission_2_item);
        equipment.pickupItem(mission_2_item);
        equipment.pickupItem(mission_2_item);
        equipment.pickupItem(mission_2_item);
        equipment.pickupItem(mission_2_item);
    }
}