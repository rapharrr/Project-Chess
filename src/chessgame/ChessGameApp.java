package chessgame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class ChessGameApp {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner scanner = new Scanner(System.in);
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try {
                ChessGameUI.clearScreen();
                ChessGameUI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = ChessGameUI.readChessPosition(scanner);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                ChessGameUI.clearScreen();
                ChessGameUI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = ChessGameUI.readChessPosition(scanner);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }
                if (chessMatch.getPromoted() != null) {
                    System.out.println("Enter Piece for promotion(B/N/R/Q): ");
                    String type = scanner.nextLine();
                    chessMatch.replacePromotedPiece(type);
                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
        ChessGameUI.clearScreen();
        ChessGameUI.printMatch(chessMatch, captured);
    }
}