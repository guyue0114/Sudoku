import java.io.*;
import java.util.*;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String filename) {
        board = new char[9][9];
        try {
            Scanner scanner = new Scanner(new File(filename));
            int row = 0;
            while (scanner.hasNextLine() && row < 9) {
                String line = scanner.nextLine();
                for (int col = 0; col < 9; col++) {
                    board[row][col] = line.charAt(col);
                }
                row++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

