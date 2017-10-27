public class PCDisplay implements Display, Observer {
    private int scoreA;
    private int scoreB;
    private Model gameData;

    public PCDisplay(Model data){
        gameData = data;
        gameData.registerObserver(this);
    }

    public void update(int score1, int score2){
        scoreA = score1;
        scoreB = score2;
        display();
    }

    public void display() {
        System.out.println("Displaying on a PC Monitor");
        System.out.println("PlayerA : " + scoreA);
        System.out.println("PlayerB : " + scoreB);
        System.out.println();
    }
}