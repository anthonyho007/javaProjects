public class ExtraPinapple extends PizzaTopping {
    private Pizza pizza;
    public ExtraPinapple(Pizza piz) {
        pizza = piz;
    }

    @Override
    public String getDescription() {
        return "Pinapple, " + pizza.getDescription();
    }

    public double cost() {
        return 0.5 + pizza.cost();
    }
}
