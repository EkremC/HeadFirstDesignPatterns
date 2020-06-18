package Chapter09_TheIteratorAndCompositePattern.iterator.dinermergeri;

public class MenuItem {
    String name;
    String decription;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String decription, boolean vegetarian, double price) {
        this.name = name;
        this.decription = decription;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDecription() {
        return decription;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
