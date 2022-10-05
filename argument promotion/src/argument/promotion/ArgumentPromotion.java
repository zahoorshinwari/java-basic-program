/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argument.promotion;
import java.util.Scanner;
/**
 *
 * @author 92333
 */
public class ArgumentPromotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        int nc = input.nextInt();
        //creating two matrices 
        int[][] a= new int[nr][nc];
        int [][] b = new int[nr][nc];
        
        for (int i = 0; i<nr; i++)
        {
            for (int j = 0; j<nc; j++)
            {
                System.out.println("enter a number  ");
            a[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i<nr; i++)
        {
            for (int j = 0; j<nc; j++)
            {
                System.out.println("enter a number  ");
            b[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        for (int i = 0; i < nr; i++)
        {
            for(int j = 0; j <nc; j++)
            {
                
                System.out.printf("%d  ", a[i][j]);
            }
            System.out.println();
        }
        
         for (int i = 0; i < nr; i++)
        {
            for(int j = 0; j <nc; j++)
            {
                
                System.out.printf("%d  ", b[i][j]);
            }
            System.out.println();
        }
        
//int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
//int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[nr][nc];  //3 rows and 3 columns  
     
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<nr;i++){    
for(int j=0;j<nc;j++){    
c[i][j]=0;
for(int k=0;k<nr;k++)      
{ 
   
    
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
}    
}} 
        
        
        
        
        
        
        /*
        Scanner input = new Scanner (System.in);
   
        
        int nr , nc ;
        System.out.println("enter the number of rows ");
        nr = input.nextInt();
        System.out.println("enter the number of coloums ");
        nc = input.nextInt();
        
        
        int [][] A = new int [nr][nc];
        int [][] B = new int [nr][nc];
        int [][] C ;
        System.out.println("enter matrix A");
        inputmatrix(A);
        System.out.println("enter matrix b");
        inputmatrix(B);
        
        System.out.println("matrix A");
        showmatrix(A);
        System.out.println("matrix B");
        showmatrix(B);
        System.out.println("matrix c = a +b");
        C = addmatrix(A,B);
        showmatrix(C);
    
        
        int [][] mat = new int[nr][nc];
        
        for (int i = 0; i<nr; i++)
        {
            for (int j = 0; j<nc; j++)
            {
                System.out.println("enter the number :");
                mat [i][j] = input.nextInt();
            }
        }
        
        for ( int i = 0; i<nr; i++)
        {
            for(int j = 0 ; j<nc; j++)
            {
                mat[i][j] *= mat[i][j];
                //System.out.println(mat[i][j] * mat[i][j]);
                System.out.printf(" %d", mat[i][j]);
            }
            System.out.println( );
        }
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  
        int size , val , index;
        
        System.out.println("enter array size");
        size = input.nextInt();
        
        int [] bar = new int [size];
        
        for(int i = 0; i< size; i++)
        {
            System.out.println("enter the element");
            bar[i] = input.nextInt();
        
        
            
        }
        
        
        // it is used for the square of the array element 
        Squarearray(bar);   //here we can call the square method
        System.out.println("square of element are :");
        for(int z : bar)    // all the array element will be store in the z
            System.out.println(z);  // it will print all the array element after the squaring
        
        
        
        
        
        
        
        
        
        
       /* System.out.println("the array all elements are :");
        
        // we can use the inhance for loop here
        
        for(int x : bar)
        System.out.println(x);  
        
        // use inhance for loop to add all array element
        int sum = 0;
        for(int p : bar)
        {
            sum += p;
            
            
            // here it will add 2 with every element
            //p += 2;
            //System.out.printf(" %d " , p);
        }
            
            System.out.printf("sum =  %d" , sum);
            System.out.println();
            
            // it is sample for loop
        //for (int i = 0; i<size; i++)
        //System.out.println (bar[i]);
        
        // it will find the index of the value 
        
        System.out.println("enter the value which we find");
        val = input.nextInt();
        index = -1;
        for(int i = 0; i<size; i++)
        {
            if(val == bar[i])
            {
                index = i;
            }
        }
        System.out.printf("index is %d ",index);
        
    }*/
    //}
    /*
    
    // here we can write the method for the squaring the element of the array
    public static void Squarearray(int [] arr)  // we can pass the argument as the array whose name is arr
    {
        for(int i = 0 ; i < arr.length; i++)    // arr.length mean that the loop will be continue upto the size of the element of the array bar 
            arr[i] *= arr[i];                   // the arr [] array can store the all element of the bar [] array
    }
    */
    /*
    public static void inputmatrix(int [][] M)
    {
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i<M.length; i++)
        {
            System.out.printf("enter row number %d :", i);
            for (int j = 0; j<M[i].length; j++)
            {
                
            
                System.out.printf("enter element number %d :", j);
                M[i][j] = input.nextInt();
            }    
        }
        
    }
    
    
    
    public static void showmatrix(int M[][])
    {
        for (int i = 0; i<M.length; i++)
        {
            for (int j = 0; j<M[i].length; j++)
            {
                System.out.printf("%d   " , M[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int[][] addmatrix(int[][] x, int[][] y)
    {
        int nrz = x.length;
        int ncz = x[0].length;
        
        int [][] z = new int[nrz][ncz];
        
        for (int i = 0; i<nrz; i++)
        
            for (int j = 0; j<ncz; j++)
            
                z[i][j] = x[i][j] + y[i][j];
                
            
              return z;
      */  
    
