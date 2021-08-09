public class MallardDuck extends Duck{

    public MallardDuck() {
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck !");
    }

}
