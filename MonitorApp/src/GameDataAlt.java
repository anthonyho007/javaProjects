import java.util.Observable;

public class GameDataAlt extends Observable {
    private int scoreA;
    private int scoreB;

    public GameDataAlt() {

    }

    public void logResults( int score1, int score2){
        scoreA = score1;
        scoreB = score2;
        setChanged();
        notifyObservers();
    }

    public int getScoreA(){
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }
}
