package Chapter01_IntroToDesignPatterns;

import Chapter01_IntroToDesignPatterns.duck.Duck;
import Chapter01_IntroToDesignPatterns.duck.MallardDuck;
import Chapter01_IntroToDesignPatterns.duck.ModelDuck;
import Chapter01_IntroToDesignPatterns.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
