public class Sudoku {
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check Column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check Row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 Grid
        int sr = (row / 3) * 3;  // Start row of 3x3 subgrid
        int sc = (col / 3) * 3;  // Start column of 3x3 subgrid
        for (int i = sr; i < sr + 3; i++) {  // Iterate over 3 rows
            for (int j = sc; j < sc + 3; j++) {  // Iterate over 3 columns
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sud(int sudoku[][], int row, int col) {
        // Base Case: If we reach the end of the board
        if (row == 9 && col == 0) {
            return true;
        }

        // Move to the next cell
        int newRow = row, newCol = col + 1;
        if (col + 1 == 9) {
            newRow = row + 1;
            newCol = 0;
        }

        // If the current cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sud(sudoku, newRow, newCol);
        }

        // Try all possible digits (1-9) for the current empty cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sud(sudoku, newRow, newCol)) {
                    return true;  // Solution found
                }
                sudoku[row][col] = 0;  // Backtrack
            }
        }

        return false;  // No solution found
    }

    public static void main(String args[]) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sud(sudoku, 0, 0)) {
            System.out.println(":solution exists");
            printSudoku(sudoku);
        } else {
            System.out.print("Solution does not exist");
        }
    }
}
