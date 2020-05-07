package Chapter01_IntroToDesignPatterns;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("RubberDuck quack");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck display");
    }
}
