public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer (DogDoor door){
        this.door = door;
    }

    public void recognize (String bark){
        System.out.println("Bark Recognizer: Hear a " + bark );
        door.open();
    }
}
