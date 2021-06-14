package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void printGamePicture() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].getPicture());
            }
            System.out.println();
        }
    }
}
