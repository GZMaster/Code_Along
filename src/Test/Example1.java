package Test;

public class Example1 {
    public static void main(String[] args) {
        boolean[][] array = {{true, false, true},
                {false, true, false}};
        int rows_length = array.length;

        for (int i = 0; i < rows_length; i++) {
            int columns_length = array[i].length;

            for (int j = 0; j < columns_length; j++) {

                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }

            }
            System.out.println();
        }
    }
}
