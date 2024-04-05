public abstract class Weapon implements IWeapon{
    protected String name;
    protected int damage;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void attack() {
        System.out.println("Using " + this.getName() + " to attack! Dealing " + this.damage + " damage");
    }
}
