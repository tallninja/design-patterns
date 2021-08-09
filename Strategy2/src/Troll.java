public class Troll extends Character {

    public Troll() {
        Weapon weapon = new Axe();
        this.setWeapon(weapon);
    }

    @Override
    public void display() {
        System.out.println("I am a Troll !");
    }

}
