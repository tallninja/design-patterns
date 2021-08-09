public class DecoyDuck extends Duck{

    public DecoyDuck() {
        FlyBehavior flyBehavior = new FlyWithoutWings();
        QuackBehavior quackBehavior = new MuteQuack();
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck !");
    }

}
