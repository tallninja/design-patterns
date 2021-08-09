public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        Duck[] ducks = { mallardDuck, redHeadDuck, rubberDuck, decoyDuck };

        for(Duck duck : ducks) {
            System.out.println();
            duck.display();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }


    }

}
