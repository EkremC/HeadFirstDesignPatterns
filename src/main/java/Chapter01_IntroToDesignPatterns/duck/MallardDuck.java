package Chapter01_IntroToDesignPatterns.duck;

import Chapter01_IntroToDesignPatterns.fly.FlyWithWings;
import Chapter01_IntroToDesignPatterns.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }
}
