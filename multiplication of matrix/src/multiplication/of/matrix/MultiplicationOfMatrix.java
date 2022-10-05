/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication.of.matrix;

import java.util.Scanner;

/**
 *
 * @author 92333
 */
public class MultiplicationOfMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner input = new Scanner(System.in);
        int nr , nc;
        System.out.println("enter the rows");
        nr = input.nextInt();        
        System.out.println("enter the colums");
        nc = input.nextInt();
        
///////////////////////////////////////////////////////////////////////////////////////////////////        
        // there are three array A , B , C  //////////////////////////////////////////////////////
        
        int [][] A = new int [nr] [nc] ;
        int [][] B = new int [nr] [nc] ;
        //int [][] C = new int [nr] [nc] ;
        int[][] C;
/////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("enter matrix A");
        inputMatrix(A);
        
        System.out.println("enter matrix b");
        inputMatrix(B);
        System.out.println("enter matrix b");
        inputMatrix(B);
         C = addMatrices(A,B);
        System.out.println(" matrix A");
        ShowMatrix(A);
        System.out.println(" matrix B");
        ShowMatrix(B);
        
        System.out.println("addition of matrix a and b is :");
        ShowMatrix(C);
        
        
        System.out.println("multiplication of matrix a and b is :");
        if(A[0].length != B.length)
        {
            System.out.println("can not multiply");
        }
        else
            {
        int [][] result = mulmatrices(A , B);
        ShowMatrix(result);
            }

    }
///////////////////////////////////////////////////////////////////////////////////////////////
        
    public static void inputMatrix( int [] [] M)
    {
        Scanner input = new Scanner (System.in);
        for(int i=0; i < M.length; i++) 
        {
           System.out.printf("enter row number %d \n", i);
            for (int j =0 ; j < M[i].length; j++)                          
            {
                System.out.printf("enter element number %d \n", j);
                 M[i][j] = input.nextInt();
            }
        }
        
        
    }
    
    // it is for the output mean show the matrix
    public static void ShowMatrix(int [][] M)
    {
        for(int i = 0; i < M.length; i++)                      
        {
            for ( int j = 0; j < M[i].length; j++)              
            {       
                System.out.printf("%d   ", M[i][j]);            
            }
            System.out.println();
        }
      
    }
    
    
// it has the addition of the matrix

    public static int[][] addMatrices(int [][]x , int [][]y)
        {
            int nrZ = x.length;
            int ncZ = x[0].length;
            int [][] Z = new int[nrZ][ncZ];
            for(int i = 0; i<nrZ; i++)
                for(int j= 0; j<ncZ; j++)
                    Z[i][j] = x[i][j] + y [i][j];
            return Z;
        }

// it is the multiplication of matrices
    public static int[][] mulmatrices(int [][] mat1, int [][] mat2)
        {
    
            int [][] answer = new int [mat1.length]  [mat2[1].length];
            for(int row = 0; row <mat1.length; row++)
            {
        
                for(int coloum = 0; coloum <mat2[1].length; coloum ++)
                {
                    for (int i = 0; i < mat1[1].length; i++)
                    {
                        answer[row][coloum] += mat1[row][i] * mat2[i][coloum];
                    }
                }
            }
                return answer;
    
        }
    
    
}
