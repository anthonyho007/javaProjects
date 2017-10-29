import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String desc = "Plan Pizza";
    ArrayList<String> toppings = new ArrayList<String>();
    public String getDescription(){
        return desc;
    };
    public abstract double cost();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ... ");
        System.out.println("Adding toppings: ");
        for(String topping :toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println( "Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Packaging Pizza");
    }

    public String getName() {
        return name;
    }

}
