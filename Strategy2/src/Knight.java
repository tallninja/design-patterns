public class Knight extends Character{

    public Knight() {
        Weapon weapon = new Sword();
        this.setWeapon(weapon);
    }

    @Override
    public void display() {
        System.out.println("I am a Knight !");
    }

}
