package Chapter6;

public class checkYourself {
    public String check(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";
    int numOfHits = 0;


        int[] locationCells = new int[0];
        for (int cell : locationCells) {
        if (guess == cell) {
            
            result = "hit";
            
            numOfHits++;
            
            break;
        } // end if
    } // end for
        
        if (numOfHits == locationCells.length) {
            
            result = "kill";
        } // end if
        
        System.out.println(result);
        
        return result;
    }

}  //end method

