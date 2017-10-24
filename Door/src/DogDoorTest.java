public class DogDoorTest {
    public static void main (String[] args){
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        remote.pressButton();

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e){}

        remote.pressButton();
    }
}
