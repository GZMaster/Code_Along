package Chapter6;
import java.util.*;

public class DotComAgain {
    private ArrayList<String> locationCells;

    private String name;

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk" + name + "  : ( ");
            } else {
                result = "hit";
            } // close if
        } // close if
        return result;
    } // close method
} // close class
