package Chapter01_IntroToDesignPatterns.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
