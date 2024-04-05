public class Player {
    PlayerClass playerClass;

    public Player(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public void attack_using_weapon(){
        this.playerClass.weapon.attack();
    }
}
