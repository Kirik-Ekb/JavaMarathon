package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        ChessBoard gameBoard = new ChessBoard(createNewBoard());
        gameBoard.printGamePicture();
    }

    private static ChessPiece[][] createNewBoard() throws FileNotFoundException {
        int widthChessBoard = 8;
        int heightChessBoard = 8;
        ChessPiece[][] chessPiece = new ChessPiece[widthChessBoard][heightChessBoard];
        String path = "E:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\";
        File file = new File(path + "combinationOfShapes");

        for (int i = 0; i < heightChessBoard; i++) {
            for (int j = 0; j < widthChessBoard; j++) {
                chessPiece[i][j] = ChessPiece.EMPTY;
            }
        }

        Scanner scanner = new Scanner(file);
        ChessPiece piece;
        while (scanner.hasNextLine()) {
            String[] strings = scanner.nextLine().split(",");
            switch (strings[2]){
                case ("KING_WHITE"):
                    piece = ChessPiece.KING_WHITE;
                    break;
                case ("KING_BLACK"):
                    piece = ChessPiece.KING_BLACK;
                    break;
                case ("QUEEN_WHITE"):
                    piece = ChessPiece.QUEEN_WHITE;
                    break;
                case ("QUEEN_BLACK"):
                    piece = ChessPiece.QUEEN_BLACK;
                    break;
                case ("ROOK_WHITE"):
                    piece = ChessPiece.ROOK_WHITE;
                    break;
                case ("ROOK_BLACK"):
                    piece = ChessPiece.ROOK_BLACK;
                    break;
                case ("BISHOP_WHITE"):
                    piece = ChessPiece.BISHOP_WHITE;
                    break;
                case ("BISHOP_BLACK"):
                    piece = ChessPiece.BISHOP_BLACK;
                    break;
                case ("KNIGHT_WHITE"):
                    piece = ChessPiece.KNIGHT_WHITE;
                    break;
                case ("KNIGHT_BLACK"):
                    piece = ChessPiece.KNIGHT_BLACK;
                    break;
                case ("PAWN_WHITE"):
                    piece = ChessPiece.PAWN_WHITE;
                    break;
                case ("PAWN_BLACK"):
                    piece = ChessPiece.PAWN_BLACK;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + strings[2]);
            }
            chessPiece[Integer.parseInt(strings[0])][Integer.parseInt(strings[1])] = piece;
        }
        scanner.close();
        return chessPiece;
    }
}
