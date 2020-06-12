package Chapter08_TheTemplateMethodPattern.barista;

public class Tee extends CaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding the lemon");
    }

    public void brew() {
        System.out.println("Steeping the tee");
    }
}
