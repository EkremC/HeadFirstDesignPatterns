package Chapter08_TheTemplateMethodPattern.baristaWithHook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected boolean customerWantsCondiments() {
        return true;
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
