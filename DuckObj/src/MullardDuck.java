public class MullardDuck extends Duck{

    public MullardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a mullardDuck");
    }
}
