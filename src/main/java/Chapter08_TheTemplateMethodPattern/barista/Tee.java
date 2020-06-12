package Chapter08_TheTemplateMethodPattern.barista;

public class Tee extends CaffeineBeverage {

    @Override
    void prepareRecipe() {
        boilWater();
        steepTeeBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("Adding the lemon");
    }

    private void steepTeeBag() {
        System.out.println("Steeping the tee");
    }


}
