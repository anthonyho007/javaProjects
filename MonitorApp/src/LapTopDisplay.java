import java.util.Observable;
import java.util.Observer;

public class LapTopDisplay implements Observer, Display {
    private Observable object;
    private int scoreA;
    private int scoreB;
    public LapTopDisplay(Observable obj) {
        object = obj;
        object.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof GameDataAlt) {
            GameDataAlt gameData = (GameDataAlt) observable;
            scoreA = gameData.getScoreA();
            scoreB = gameData.getScoreB();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Streaming game results on Laptop");
        System.out.println("Player 1 : " + scoreA);
        System.out.println("Player 2 : " + scoreB);
        System.out.println();
    }
}