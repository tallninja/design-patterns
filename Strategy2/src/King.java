public class King extends Character {

    public King() {
        Weapon weapon = new BowAndArrow();
        this.setWeapon(weapon);
    }

    @Override
    public void display() {
        System.out.println("I am a King !");
    }

}
