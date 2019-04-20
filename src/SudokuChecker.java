/*
public class SudokuChecker {
    public static void main(String[] args) {
        int[][] gridBad = {
                {5,3,4,6,7,8,9,1,2 },
                {6,7,2,1,9,5,3,4,8 },
                {1,9,8,3,4,2,5,6,7 },
                {8,5,9,7,6,1,4,2,3 },
                {4,2,6,8,5,3,7,9,1 },
                {7,1,3,9,2,4,8,5,6 },
                {9,6,1,5,3,7,2,8,4 },
                {2,8,7,4,1,9,6,3,5 },
                {3,4,6,5,2,1,9,7,8 }
        };
        }

    }
    public static boolean isValid(int[][] grid) {
        boolean rowsValid = true;
        boolean colsValid = true;
        boolean groupsValid = true;

        for (int part = 0; part < 9 ; part++) {
            rowsValid = rowsValid && isValidRow(grid[part]);
            colsValid = colsValid && isValidCol(gird[part]);
        }
        return rowsValid && colsValid && groupsValid;
    }
    public static boolean isValidRow(int[] row) {
        boolean[] values = new boolean[row.length]; //creates a array of 9 slots all set to false
        for (int value : row) {
            values [value - 1] = true;
        }
        return allUnique(values);
    }

    public static boolean allUnique(boolean[] data) {
        boolean unique = true;
        for (boolean value : data) {
            if (value == false) {
                unique = false;
            }
        }
        return unique;
    }
    public static boolean isValidCol(int[][] grid, int col) {
        boolean[] values = new boolean[grid.length];

        for (int[] row: grid) {
            int colValue = row[col];
            values[row[col]] -1 = true;
        }
        return allUnique(colvalue);
    }
    public static boolean isValidGroup(int[][] grid, int group) {
        boolean[] values = new boolean[grid.length];
        int rowStart = (group / 3) * 3; //forces integer division i.e. 1,1,1,2,2,2,3,3,3
        int colStart = (group % 3) * 3; // i.e. 0,1,2,0,1,2,0,1,2

        for (int row = rowStart; row < rowStart + 3; row++) {
            for (int col = colStart; col < colStart + 3; col++) {

            }
        }
        return allUnique(values);
    }
}
*/