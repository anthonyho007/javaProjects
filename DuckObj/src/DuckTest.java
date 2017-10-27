public class DuckTest {
    public static void main(String[] args){
        Duck mullard = new MullardDuck();
        mullard.display();
        mullard.performFly();
        mullard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior( new FlyingRocket());
        modelDuck.performFly();
    }
}
