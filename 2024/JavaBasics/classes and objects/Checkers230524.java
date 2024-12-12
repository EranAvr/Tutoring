package exercises;

/*
    This is an example, shows the beginning
    of a Checker game implementation.

    The goal is to present a practical example
    for the need of classes.
    When we build a complex software, we might want
    to express complex data with a class.
    That way, we can save many data-fields (variables) under
    a single context, a single class.

    In the example below,
    the game board is expressed by a 2D-array,
    BUT, it also has constants for board-symbols,
    and there are methods that are associated with the board
    like moving pieces.
    So, we create a Board class, to hold all the variables, constants
    and methods of the game board.
 */

class Piece{
    char symbol;
    int location_i;
    int location_j;
    public Piece(char color, int i, int j){
        this.symbol = color;
        this.location_i = i;
        this.location_j = j;
    }
}

class Board{
    final static char BLACK_PIECE = 'b';
    final static char WHITE_PIECE = 'w';
    final static char EMPTY_CELL = '_';
    char[][] board;


    public Board(){
        board = new char[8][8];

        initTable(board);
    }

    // Initialization:
    public void initTable(char[][] arr){
        // Empty cells-
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = EMPTY_CELL;
            }
        }

        // Black pieces-
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    arr[i][j] = BLACK_PIECE;
                if (i % 2 != 0 && j % 2 != 0)
                    arr[i][j] = BLACK_PIECE;
            }
        }

        // White pieces-
        for (int i = arr.length-2; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    arr[i][j] = WHITE_PIECE;
                if (i % 2 != 0 && j % 2 != 0)
                    arr[i][j] = WHITE_PIECE;
            }
        }
    }
    // Move pieces:
    public void moveWhite(int from_i_index, int from_j_index, int to_j_index){
        // a method to move a white piece.
    }
    public void moveBlack(int from_i_index, int from_j_index, int to_j_index){}
    public void movePiece(int from_i_index, int from_j_index, int to_i_index, int to_j_index){}



    // printTable() as an object-self-method.
    // to use this, we call: myBoard.printTable()
    public void printTable(){
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                System.out.print(this.board[i][j] + ",");
            }
            System.out.println();
        }
    }
    // printTable() as an static-class-method:
    // to use this, we call: Board.printTable(myBoard.board);
    static public void printTable(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}

public class Checkers230524 {

    public static void main(String[] args) {
        Board myBoard = new Board();

        Board.printTable(myBoard.board);
        System.out.println("-------------------");
        myBoard.printTable();

    }

}
