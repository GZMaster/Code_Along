package Chapter2;

public class DVDPlayerTestDrive {
    public static void main (String [] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        //This line below is calling a method that doesnt exist
        //d.playDVD();      //Either create the method in DVDPlayer class or remove

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
