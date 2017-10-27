public class displayTest {
    public static void main(String[] args){
        GameData currentData = new GameData();

        MiniDisplay smallDisplay = new MiniDisplay(currentData);
        PCDisplay   bigDisplay      = new PCDisplay(currentData);

        currentData.logResults(1,0);
        currentData.logResults(2,0);
        currentData.logResults(2,1);
        currentData.logResults(2,5);

        GameDataAlt javaBuildin = new GameDataAlt();

        LapTopDisplay laptop = new LapTopDisplay(javaBuildin);
        javaBuildin.logResults(10, 2);
        javaBuildin.logResults(15, 20);
    }
}
