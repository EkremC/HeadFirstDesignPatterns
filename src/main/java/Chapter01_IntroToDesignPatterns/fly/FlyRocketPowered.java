package Chapter01_IntroToDesignPatterns.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
