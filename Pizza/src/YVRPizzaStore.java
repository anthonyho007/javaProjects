public class YVRPizzaStore extends PizzaStore {
    public Pizza createPizza(String name){
        if (name.equals("cheese")) {
            return new CheesePizza();
        }
        else if ( name.equals("peperoni")) {
            return new PeperoniPizza();
        }
        else {
            return null;
        }
    }
}
