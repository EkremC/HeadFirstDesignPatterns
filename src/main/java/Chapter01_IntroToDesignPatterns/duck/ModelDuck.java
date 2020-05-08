package Chapter01_IntroToDesignPatterns.duck;

import Chapter01_IntroToDesignPatterns.fly.FlyNoWay;
import Chapter01_IntroToDesignPatterns.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}
