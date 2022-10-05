/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.multiplacation.in.java;
/**
 *
 * @author 92333
 */
import java.util.*;
public class MatrixMultiplacationInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  /*       int r1 = 2, c1 = 3; int r2 = 3, c2 = 2;
         int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
         int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
         // Mutliplying Two matrices
         int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);
         // Displaying the result
         displayProduct(product);
    }
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2)
    {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++)
           { for (int j = 0; j < c2; j++)
              { for (int k = 0; k < c1; k++)
                { product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
              }
           }
        return product;
    }
    public static void displayProduct(int[][] product)
    {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product)
        {
            for (int column : row)
            {
                System.out.print(column + " ");
            }
            System.out.println(); 
        }
    }
*/
    Scanner input = new Scanner(System.in);
        
        int nr,nc;
        
        System.out.println("Enter Number of Rows : ");
        nr=input.nextInt();
        
        System.out.println("Enter Number of cols : ");
        nc=input.nextInt();
        
        int[][] mat1 = new int[nr][nc];
        int[][] mat2 = new int[nr][nc];
        int[][] mat3;
        
        inputMatrix(mat1);
        inputMatrix(mat2);
        showMatrix(mat1);
        System.out.println("");
        showMatrix(mat2);
        
      mat3 = multiplyMatrix(mat1,mat2);
       
       System.out.println("Multiplication Matrix value :");
       showMatrix(mat3);
        
                        
 
        }
       public static void inputMatrix(int[][] m)
        {
            Scanner input =new Scanner(System.in);
             
              int i,j;
              for(i=0; i<m.length; i++)   
              {
               System.out.printf("Enter Element number  %d \n", i);
             for( j=0; j<m[i].length; j++)
             {
                  System.out.printf("Enter Element number  %d \n", j);
                  m[i][j]=input.nextInt();
                 
             }
                System.out.println("");
            }
            
          
        }
      
      public static void showMatrix(int[][] m)
      {
           for(int i=0; i< m.length; i++)
            {
              
             for( int j=0; j<m[i].length; j++)
             {
              
                 System.out.printf("%d ", m[i][j]);
             }
                System.out.println();
            }
      }
      
        public static int[][] addMatrices(int[][] x,int[][] y)
     {
        int nrz = x.length;
        int ncz=x[0].length;
        int[][] z =new int[nrz][ncz];
        
        
         for(int i=0; i<nrz; i++)
          for(int j=0; j<ncz; j++)  
            z[i][j]=x[i][j]+y[i][j];
           
          return z;
        
     }  
    
  public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2)
   {
      int[][] multiply = new int[matrix1.length][matrix2.length];
      for(int i = 0; i < multiply.length; i++) 
      {
         for(int j = 0; j < multiply[i].length; j++) 
         {
            for(int k = 0; k < multiply.length; k++) 
            {
               multiply[i][j] += matrix1[i][k] * matrix2[k][j];
            }
     
         }
      }
      return multiply;
   }
}
     
     

    

