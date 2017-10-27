public class PizzaTest {
    public static void main( String[] args) {
        Pizza order1 = new PeperoniPizza();
        print(order1);

        Pizza order2 = new CheesePizza();
        order2 = new ExtraCheese(new ExtraPinapple(new ExtraPinapple(order2)));
        print(order2);
    }

    public static void print(Pizza pizza){
        System.out.println(pizza.getDescription() + " : $" + pizza.cost());
    }
}
