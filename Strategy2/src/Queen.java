public class Queen extends Character {

    public Queen() {
        Weapon weapon = new Knife();
        this.setWeapon(weapon);
    }

    @Override
    public void display() {
        System.out.println("I am the Queen !");
    }

}
