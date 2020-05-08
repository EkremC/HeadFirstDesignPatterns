package Chapter01_IntroToDesignPatterns.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}
