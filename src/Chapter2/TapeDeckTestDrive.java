package Chapter2;

public class TapeDeckTestDrive {
    public static void main (String [] args) {
        TapeDeck t = new TapeDeck();    //This is the line missing that makes this example work

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
