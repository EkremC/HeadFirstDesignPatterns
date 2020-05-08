package Chapter01_IntroToDesignPatterns;

import Chapter01_IntroToDesignPatterns.duck.Duck;
import Chapter01_IntroToDesignPatterns.duck.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
