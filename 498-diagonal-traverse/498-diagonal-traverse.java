class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {        
        if( matrix == null || matrix.length ==0){
            return new int[0];
        }
        int rows = matrix.length;
	    int cols = matrix[0].length;
	    int answer[] = new int[rows * cols];
        int n_row=0, n_col=0;
        
        for(int i=0; i<answer.length; ++i) {
            answer[i] = matrix[n_row][n_col];
            if((n_row + n_col) % 2 == 0) {
                if(n_col == cols-1) 
                    n_row++;
                else if(n_row == 0) 
                    n_col++;
                else {
                    n_row--;
		            n_col++;
                }
            } else {
                if(n_row == rows-1) 
                    n_col++;
                else if(n_col == 0) 
                    n_row++;
                else {
                    n_col--;
                    n_row++;
                }
            }
        }
        return answer;
    }
}