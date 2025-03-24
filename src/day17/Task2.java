package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE},
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY},
                {ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.KING_WHITE, ChessPiece.ROOK_WHITE}
        });
        chessBoard.print();
    }
}
