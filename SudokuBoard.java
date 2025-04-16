import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String filename) {
        board = new char[9][9];  
        try {
            Scanner input = new Scanner(new File(filename));
            for (int i = 0; i < 9; i++) {
                String line = input.nextLine();
                for (int j = 0; j < 9; j++) {
                    board[i][j] = line.charAt(j);  
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }


