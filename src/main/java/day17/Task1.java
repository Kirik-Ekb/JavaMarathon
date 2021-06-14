package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures = new ChessPiece[8];
        ChessPiece figure = ChessPiece.PAWN_WHITE;

        for (int i = 0; i < 8; i++) {
            figures[i] = figure;
            if (i == 3) {
                figure = ChessPiece.ROOK_BLACK;
            }
        }

        for (ChessPiece chessPiece : figures) {
            System.out.print(chessPiece.getPicture() + " ");
        }
    }
}