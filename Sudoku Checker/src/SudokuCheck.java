
public class SudokuCheck {
	
	public static boolean check(int [] [] s) {
		// to check rows
		for(int row = 0; row < 9; row++) {
		   for(int col = 0; col < 8; col++) {
		      for(int col2 = col + 1; col2 < 9; col2++) {
		         if(s[row][col]==s[row][col2])
		            return false;
		      }
		   }
		}
		// to check columns 
		for(int col = 0; col < 9; col++) {
		   for(int row = 0; row < 8; row++) {
		      for(int row2 = row + 1; row2 < 9; row2++) {
		         if(s[row][col]==s[row2][col])
		            return false;
		      }
		   }
		}
	
	// for checking a 3x3 square
	for (int i = 0; i < 9; i+=3){
        for (int j = 0; j < 9; j+=3){ 
            for (int r = 0; r < 8; r++){
                for (int r2 = r + 1; r2 < 9; r2++){
    				if (s[i + r % 3] [j + r /3] == s[i + r2 % 3] [j + r2/3]) {
    					return false;}			
    				
    				}
    			
    			}
           }
	}
	return true;
}

	public static void main(String[] args) {
		// A valid sudoko
		int[][] a = { 
				{5, 3, 4, 6, 7, 8, 9, 1, 2},

				{6, 7, 2, 1, 9, 5, 3, 4, 8},

				{1, 9, 8, 3, 4, 2, 5, 6, 7},

				{8, 5, 9, 7, 6, 1, 4, 2, 3},

				{4, 2, 6, 8, 5, 3, 7, 9, 1},

				{7, 1, 3, 9, 2, 4, 8, 5, 6},

				{9, 6, 1, 5, 3, 7, 2, 8, 4},

				{2, 8, 7, 4, 1, 9, 6, 3, 5},

				{3, 4, 5, 2, 8, 6, 1, 7, 9} };

			if (check(a) == true) System.out.println("Valid Solution");
			else System.out.println("Not a valid solution");
		
	}
}


