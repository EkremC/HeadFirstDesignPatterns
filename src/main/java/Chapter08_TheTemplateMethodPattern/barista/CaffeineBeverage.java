package Chapter08_TheTemplateMethodPattern.barista;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public void boilWater() {
        System.out.println("Booling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
