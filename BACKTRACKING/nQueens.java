public class nQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
       System.out.println( queens(board, 0));
    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
           
            return 1;       //found queens
        }

        // Placing queens and checking for every row and col

        int count = 0;
        for(int col = 0; col < board.length; col++){
            //place the queen if it is safe

            if(isSafe(board, row, col)){
                board[row][col] = true;
                count = count + queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean elements : row){
                if(elements){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
       
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //check vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // check for left daigonal row
        int leftMax = Math.min(row,col);
        for(int i = 0; i < leftMax; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }


        // check for right daigonal row
        int rightMax = Math.min(row,board.length-col-1);
        for(int i = 1; i <= rightMax; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
