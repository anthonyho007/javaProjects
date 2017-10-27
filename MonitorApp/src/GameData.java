import java.util.ArrayList;

public class GameData implements Model {
    private ArrayList<Observer> observers;
    private int scoreA;
    private int scoreB;

    public  GameData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        if ( observers.indexOf(o) >= 0){
            observers.remove(observers.indexOf(o));
        }
    }

    public void notifyObservers(){
        for( Observer observer : observers){
            observer.update(scoreA, scoreB);
        }
    }

    public void endTurn(){
        notifyObservers();
    }

    public void logResults( int score1, int score2){
        scoreA = score1;
        scoreB = score2;
        endTurn();
    }
}
