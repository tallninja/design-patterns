abstract class Character {

    private Weapon weapon;

    abstract void display();

    public void fight() {
        this.weapon.useWeapon();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
