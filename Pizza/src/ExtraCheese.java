public class ExtraCheese extends PizzaTopping {
    Pizza pizza;
    public ExtraCheese(Pizza piz) {
        pizza = piz;
    }

    @Override
    public String getDescription() {
        return "Cheese, " + pizza.getDescription();
    }

    @Override
    public double cost() {
        return 0.25 + pizza.cost();
    }
}
