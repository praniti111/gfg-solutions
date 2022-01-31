// Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

// Example 1:

// Input:
// N = 3
// matrix[][] = [[1 2 3],
//               [4 5 6],
//               [7 8 9]]
// Output:
// 3 6 9 
// 2 5 8 
// 1 4 7

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        transpose(matrix);
        swapRows(matrix);    
    }
  
    static void transpose(int[][] matrix)
    {
      for(int i = 0;i<matrix.length;i++)
      {
        for(int j = i+1;j<matrix[0].length;j++)
        {
          swap(matrix,i,j);
        }
      }
    }
  static void swap(int [][] matrix, int i, int j)// swap function to swap the elements for transpose
  {
    int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
  }
  
  static void swapRows(int[][] matrix) // as we have to rotate it by ANTI CLOCKWISE we have to swap the rows
  {
    int top = 0, bottom = matrix.length-1;
    
    while(top<bottom)
    {
      for(int j = 0;j<matrix[0].length;j++)
      {
        swap(matrix, j, top, bottom);
      }
      top++;
      bottom--;
    }
  }
  
  static void swap(int [][] matrix, int j, int top, int bottom)// Swap function to swap rows
  {
    int temp = matrix[top][j];
    matrix[top][j] = matrix[bottom][j];
    matrix[bottom][j] = temp;
  }
  
}
    
