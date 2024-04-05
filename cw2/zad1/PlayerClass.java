public abstract class PlayerClass implements IPlayerClass{
    protected String name;
    protected Weapon weapon;
    @Override
    public String getName() {
        return this.name;
    }
}
