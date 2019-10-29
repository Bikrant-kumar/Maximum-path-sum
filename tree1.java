 //converting the total triangle in 15 * 15 matrix
class GFG { 
          
    static int N = 15; 
      
    // Function for finding maximum sum 
    static int maxPathSum(int tri[][], int m, int n) 
    { 
        // loop for bottom-up calculation 
        for (int i = m - 1; i >= 0; i--) 
        { 
            for (int j = 0; j <= i; j++) 
            { 
                // for each element, check both 
                // elements just below the number 
                // and below right to the number 
                // add the maximum of them to it 
                if (tri[i + 1][j] > tri[i + 1][j + 1]) 
                    tri[i][j] += tri[i + 1][j]; 
                else
                    tri[i][j] += tri[i + 1][j + 1]; 
            } 
        } 
      
        // return the top element 
        // which stores the maximum sum 
        return tri[0][0]; 
    } };
