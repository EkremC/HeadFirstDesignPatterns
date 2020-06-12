package Chapter08_TheTemplateMethodPattern.barista;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tee tee = new Tee();
        Coffee coffee = new Coffee();

        System.out.println("Making tee...");
        tee.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
