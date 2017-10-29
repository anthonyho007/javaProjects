public class PizzaTest {
    public static void main( String[] args) {
        Pizza order1 = new PeperoniPizza();
        print(order1);

        Pizza order2 = new CheesePizza();
        order2 = new ExtraCheese(new ExtraPinapple(new ExtraPinapple(order2)));
        print(order2);

        PizzaStore yvrpizza = new YVRPizzaStore();
        Pizza order3 = yvrpizza.orderPizza("cheese");
        System.out.println("Order a " + order3.getName() + "\n");
    }

    public static void print(Pizza pizza){
        System.out.println(pizza.getDescription() + " : $" + pizza.cost());
    }
}
