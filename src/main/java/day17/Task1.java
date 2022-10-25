package day17;

public class Task1 {
    public static void main(String[] args) {
        String[] figures = new String[8];       // or fill by hands
        ChessPiece chessPiece1 = ChessPiece.PAWN_WHITE;
        ChessPiece chessPiece2 = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < 4; i++) {
            figures[i] = chessPiece1.getName();
            System.out.print(figures[i] + " ");
        }
        for (int i = 4; i < 8; i++) {
            figures[i] = chessPiece2.getName();
            System.out.print(figures[i] + " ");
        }
    }
}