/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.dimentional.array;
import java.util.Scanner;
import javax.swing.JOptionPane; 
/**
 *
 * @author 92333
 */
public class TwoDimentionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nr , nc;
        System.out.println("enter the rows");
        nr = input.nextInt();
        
        //String nr_str =JOptionPane.showInputDialog("enter the rows");
        //nr = Integer.parseInt(nr_str);
        
        
        System.out.println("enter the colums");
        nc = input.nextInt();
        
        //String nc_str =JOptionPane.showInputDialog("enter the colums");
        //nc = Integer.parseInt(nc_str);
        
        /*int [][] mat = new int[nr][nc];
        for(int i = 0; i<nr; i++)
        {
            for(int j = 0; j<nc; j++)
            {
                System.out.println("enter a number");
                mat[i][j] = input.nextInt();
                
            }
        }
        for(int i =0; i<nr; i++)
        {
            for(int j = 0; j<nc; j++)
            {
                System.out.println(mat[i][j] * mat[i][j]);
                
            }
        }*/
        
///////////////////////////////////////////////////////////////////////////////////////////////////        
        // there are three array A , B , C  //////////////////////////////////////////////////////
        
        int [][] A = new int [nr] [nc] ;
        int [][] B = new int [nr] [nc] ;
        //int [][] C = new int [nr] [nc] ;
        int[][] C;
/////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////// here we call the array //////////////////////////////////////////////////
         

            //String msg1 = String.format("enter matrix A");
            //JOptionPane.showMessageDialog(null , msg1);


        System.out.println("enter matrix A");
        inputMatrix(A);
        
        System.out.println("enter matrix b");
        inputMatrix(B);
        // C = addMatrices(A,B);
        
        //String msg4 = String.format("enter matrix b");
        //    JOptionPane.showMessageDialog(null , msg4);
        
        
        
        System.out.println(" matrix A");
        ShowMatrix(A);
        System.out.println(" matrix B");
        ShowMatrix(B);
        
        System.out.println("addition of matrix a and b is :");
        
        ShowMatrix(C);
        
        int [][] result = mulmatrices(A , B);
        ShowMatrix(result);
    }
///////////////////////////////////////////////////////////////////////////////////////////////
        
    public static void inputMatrix( int [] [] M)
    {
        Scanner input = new Scanner (System.in);
        for(int i=0; i < M.length; i++)                                      // M.length can specify the first row and then 2nd one and so on ...............
        {
           System.out.printf("enter row number %d \n", i);
            
        //String msg1 = String.format("enter row number %d \n", i);
        //JOptionPane.showMessageDialog(null , msg1);
        
        
            for (int j =0 ; j < M[i].length; j++)                          // M[i].length can specify the 1st row element and then 2nd one and so on ..........
            {
                
                
                
         //String msg2 = String.format("enter element number %d \n", j);
        //JOptionPane.showMessageDialog(null , msg2);
                
                
                
                System.out.printf("enter element number %d \n", j);
                
                
           //String M_str = JOptionPane.showInputDialog("enter a number");
           //M[i][j] = Integer.parseInt(M_str);
               

                 M[i][j] = input.nextInt();
            }
        }
        
        
    }
    public static void ShowMatrix(int [][] M)
    {
        for(int i = 0; i < M.length; i++)                         // here it will be specify first row and then compile the 2nd loop inside this loop . and then 2nd row and so on ............
        {
            for ( int j = 0; j < M[i].length; j++)               // here it will specify the first row element and then the 2nd row element and so on ............
            {
                
        //String msg3 = String.format("%d   ", M[i][j]);
        //JOptionPane.showMessageDialog(null , msg3);
                
                System.out.printf("%d   ", M[i][j]);            // it will print the whole matrix or arrays 
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


public static int[][] mulmatrices(int [][] mat1, int [][] mat2)
{
    
    int [][] answer = new int [mat1.length]  [mat2[0].length];
    for(int row = 0; row <mat1.length; row++)
    {
        
        for(int coloum = 0; coloum <mat2[0].length; coloum ++)
        {
            for (int i = 0; i < mat1[0].length; i++)
            {
                answer[row][coloum] += mat1[row][i] * mat2[i][coloum];
            }
        }
    }
    return answer;
    
}



    }
    

