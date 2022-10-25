package day17;

public class ChessBoard {
    private ChessPiece[][] figures;

    public ChessBoard(ChessPiece[][] figures) {
        this.figures = figures;
    }

    public void print() {
        for (int i = 0; i < figures.length; i++) {
            for (int j = 0; j < figures[i].length; j++) {
                System.out.print(figures[i][j].getName());
            }
            System.out.println();
        }
    }
}
