/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.*;

/**
 *
 * @author 92333
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 // row1 and col1 is for matrix 1
 // row2 and col2 is for matrix 2
 // sum is to add all the number in the multiplication are store in sum
 
 
int row1, row2,col1,col2,sum;
Scanner input = new Scanner(System.in);
 
System.out.println("Enter the number of rows of matrix1");
row1 = input.nextInt();
 
System.out.println("Enter the number columns of matrix 1");
col1 = input.nextInt();
System.out.println("Enter the number of rows of matrix2");
row2 = input.nextInt();
 
System.out.println("Enter the number of columns of matrix 2");
col2 = input.nextInt();
 

 // here we create and initialize the two dimentional array 
 // mat1 is for matrix 1
 // mat2 is for matrix 2
 
int mat1[][] = new int[row1][col1]; 
int mat2[][] = new int[row2][col2]; 
int res[][] = new int[row1][col2];            // dalta ba mong da matrix 1 aw da matrix 2 result store kawo che km mong multiply ko
 ///////////////////// input matrix 1 ////////////////////////////////
 
 
 // kala che da first matrix coloums  da 2nd matrix rows barabar we nu multiplication ba possible we 
 // other wise na ba we possible
 
 if(row1 != col2)
 
     System.out.println("matrix can not multiply");
 
 else
 {
 
System.out.println("Enter the elements of matrix1");

// suppose row1 = 2
// suppose col1 = 3
 
for (int i= 0 ; i < row1 ; i++ )                                                 // 1st iteration i = 0 , 2nd iteration  i = 1 , bia ba condition false she nu da ba terminate she 
{ 
 
for (int j= 0 ; j < col1 ;j++ )                                                  // da ba tol iteration pora kawe paila nu bia ba outer loop ta ze aw increement kigi ba ,,,,,, j=0 , j= 1 , j=2,   aw dy na bad ba outer loop ta ze    
{
       System.out.printf("%d    %d    ", i , j);
       mat1[i][j] = input.nextInt();                                                    // dalta ba tol number user input kawe  ,,,,   0,0 index 2,     0,1 index 5,     0,2 index 6,     and  1,0 = 5 , 1,1= 6, 1,2 = 9;    and so on 
} 
}
/////////////////////// show matrix 1 /////////////////////////////////
System.out.printf("matrix 1 is \n");
for (int i= 0 ; i < row1 ; i++ )
{ 
 
for (int j= 0 ; j < col1 ;j++ )
{
    
    System.out.printf("%d    " , mat1[i][j]);   // da ba tol number show ka che somra user enter kare we 
}

 System.out.printf("\n \n");
}
///////////////// input matrix 2 /////////////////////////////////////


System.out.println("Enter the elements of matrix2");
 
for (int i= 0 ; i < row2 ; i++ )
{ 
    
 
for (int j= 0 ; j < col2 ;j++ )
{
    System.out.printf("%d    %d    ", i , j);
    mat2[i][j] = input.nextInt();                                                                             // user enter all the number here at index    00 = 5 , 01 =8 , 02= 9;     10 = 3 , 11 = 98,   12 = 8 and so on..
}
}
/////////////////////show matrix 2  ////////////////////////////////////
System.out.printf("matrix 2 is \n");
for (int i= 0 ; i < row2 ; i++ )
{ 
 
for (int j= 0 ; j < col2 ;j++ )
{
    
    System.out.printf("%d  " , mat2[i][j]);                                                              // show the nuber that enter by the user
}

 System.out.printf("\n \n");
}


 /////////////////////// show output matrix ////////////////////////
System.out.println("\n\n   output matrix:-");

sum = 0;   // dalta sum da 0 barabr dy hes hum nashta pake


for (int i= 0 ; i < row1 ; i++ )                                                                        // dalta ba i start we 0 na aw end ba ye pa 1 bndy kigi zaka che mong 1st matrix ke 2 rows akheste way
{
 
for (int j= 0 ; j <col2;j++)                                                                           //  dalta ba j start we da 0 na aw end ba ya 2 bndy we zaka che mong 2nd matrix ke 3 rows akheste way
{
for (int k= 0 ; k <col1;k++ )                                                                         //  dalta ba k 0 na start akhle aw ending ba pa 2 bndy ka zaka che col1 mong sara da first matrix coloums dy che hagha 3
{
//sum +=mat1[i][k]*mat2[k][j] ; 

res[i][j] = res[i][j]+ mat1[i][k]*mat2[k][j] ; 
// da ba paila tol loop pora kai bia ba ze first loop ta aw increase kigi
// System.out.println("\n");                                                                                                     // paila che km da index (i) aw da index (k) value we hagha ba multiply kawe da index (k) aw da index (j) sara aw bia ye add ka sum sara 
 System.out.printf("%d  %d  %d ",  i,j,k);
 System.out.println();
 
 
}
//res[i][j]=sum;
}
}


for (int i= 0 ; i < row1; i++ )
{
for (int j=0 ; j < col2;j++ )
{
System.out.print(res[i][j]+" \t ");
//System.out.println( res[i][j]); 

}
System.out.println("\n");

 
}
 }
    }}        
    
    

