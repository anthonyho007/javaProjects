public class MiniDisplay implements Display, Observer{
    private int scoreA;
    private int scoreB;
    private Model gameData;

    public MiniDisplay(Model data){
        gameData = data;
        gameData.registerObserver(this);
    }

    public void update( int score1, int score2) {
        scoreA = score1;
        scoreB = score2;
        display();
    }

    public void display() {
        System.out.println("On mini Screen");
        System.out.println("Player A : " + scoreA);
        System.out.println("Player B : " + scoreB);
        System.out.println();
    }
}