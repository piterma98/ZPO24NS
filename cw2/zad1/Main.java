public class Main {

    public static void main(String[] args) {

        Player player_as_gunsmith = new Player(new Gunsmith());
        Player player_as_knight = new Player(new Knight());
        Player player_as_archer = new Player(new Archer());
        Player player_as_canonner = new Player(new Cannoneer());

        player_as_gunsmith.attack_using_weapon();
        player_as_knight.attack_using_weapon();
        player_as_canonner.attack_using_weapon();
        player_as_archer.attack_using_weapon();
    }
}