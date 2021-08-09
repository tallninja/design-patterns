public class RubberDuck extends Duck{

    public RubberDuck() {
        FlyBehavior flyBehavior = new FlyWithoutWings();
        QuackBehavior quackBehavior = new Squeak();
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck !");
    }

}
