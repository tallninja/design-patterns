public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        FlyBehavior flyBehavior = new FlyWithoutWings();
        QuackBehavior quackBehavior = new Quack();
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a RedHead Duck !");
    }

}
