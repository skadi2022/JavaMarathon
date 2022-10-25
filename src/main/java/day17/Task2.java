package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] figures = new ChessPiece[8][8];

        for (int i = 0; i < figures.length; i++) {
            for (int j = 0; j < figures[i].length; j++) {
                figures[i][j] = ChessPiece.EMPTY;
            }
        }

        figures[0][0] = ChessPiece.ROOK_BLACK;
        figures[0][5] = ChessPiece.ROOK_BLACK;
        figures[0][6] = ChessPiece.KING_BLACK;

        figures[1][1] = ChessPiece.ROOK_WHITE;
        figures[1][4] = ChessPiece.PAWN_BLACK;
        figures[1][5] = ChessPiece.PAWN_BLACK;
        figures[1][7] = ChessPiece.PAWN_BLACK;

        figures[2][0] = ChessPiece.PAWN_BLACK;
        figures[2][2] = ChessPiece.KNIGHT_BLACK;
        figures[2][6] = ChessPiece.PAWN_BLACK;

        figures[3][0] = ChessPiece.QUEEN_BLACK;
        figures[3][3] = ChessPiece.BISHOP_WHITE;

        figures[4][3] = ChessPiece.BISHOP_BLACK;
        figures[4][4] = ChessPiece.PAWN_WHITE;

        figures[5][4] = ChessPiece.BISHOP_WHITE;
        figures[5][5] = ChessPiece.PAWN_WHITE;

        figures[6][0] = ChessPiece.PAWN_WHITE;
        figures[6][3] = ChessPiece.QUEEN_WHITE;
        figures[6][5] = ChessPiece.PAWN_WHITE;
        figures[6][7] = ChessPiece.PAWN_WHITE;

        figures[7][5] = ChessPiece.ROOK_WHITE;
        figures[7][6] = ChessPiece.KING_WHITE;

        ChessBoard chessBoard = new ChessBoard (figures);
        chessBoard.print();
    }
}



//public class Task2 {
//    public static void main(String[] args) {
//        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][] {{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
//                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY},
//                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
//        });
//
//        chessBoard.print();
//    }
//}

