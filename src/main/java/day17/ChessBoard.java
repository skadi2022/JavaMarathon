package day17;

public class ChessBoard {

    public ChessBoard(String[][] figures) {

    }

    public void print(String[][] figures) {
        for (int i = 0; i < figures.length; i++) {
            for (int j = 0; j < figures[i].length; j++) {
                System.out.print(figures[i][j]);
            }
            System.out.println();
        }
    }
}
