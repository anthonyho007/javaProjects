public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck () {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void setFlyBehavior(FlyBehavior fly){
        flyBehavior = fly;
    }

    public void setQuackBehavior(QuackBehavior quack){
        quackBehavior = quack;
    }
}
