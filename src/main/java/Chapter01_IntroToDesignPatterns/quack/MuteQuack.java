package Chapter01_IntroToDesignPatterns.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }
}