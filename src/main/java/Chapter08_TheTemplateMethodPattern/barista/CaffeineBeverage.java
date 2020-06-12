package Chapter08_TheTemplateMethodPattern.barista;

public abstract class CaffeineBeverage {

    abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Booling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
