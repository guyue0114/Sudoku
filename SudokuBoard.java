import java.io.*;
import java.util.*;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String filename) {
        try {
            List<String> lines = new ArrayList<>();
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();

            int numRows = lines.size();
            int numCols = lines.get(0).length(); 
            board = new char[numRows][numCols];

            for (int row = 0; row < numRows; row++) {
                String line = lines.get(row);
                for (int col = 0; col < numCols; col++) {
                    board[row][col] = line.charAt(col);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < board.length; row++) {
            if (row % 3 == 0 && row != 0) {
                sb.append("------+-------+------\n");
            }
            for (int col = 0; col < board[row].length; col++) {
                if (col % 3 == 0 && col != 0) {
                    sb.append("| ");
                }
                sb.append(board[row][col]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}



/*
# PROGRAM OUTPUT

2 . . | 1 . 5 | . . 3 
. 5 4 | . . . | 7 1 . 
. 1 . | 2 . 3 | . 8 . 
------+-------+------
6 . 2 | 8 . 7 | 3 . 4 
. . . | . . . | . . . 
1 . 5 | 3 . 9 | 8 . 6 
------+-------+------
. 2 . | 7 . 1 | . 6 . 
. 8 1 | . . . | 2 4 . 
7 . . | 4 . 2 | . . 1 
*/
