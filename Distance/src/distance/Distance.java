/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;
import java.util.*;
/**
 *
 * @author 92333
 */
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    /* int size;
     size = input.nextInt();
     int [] myar = new int[size];
     for(int i = 0; i < myar.length; i++)
     {
         myar[i] = input.nextInt();
     }
   squarearray(myar);
   for(int p : myar)
       System.out.println(p);
    }
   public static void squarearray(int [] ar )
   {
       
   for(int i = 0; i<ar.length; i++)
   {
       ar[i] *= ar[i];
   }

*/
    /*int [][] arj = {{3,4,5},
                    {5,3},
                    {6,6,5,4,3}};
    
    
    for (int i = 0 ; i < arj.length; i++)
    {
        for(int j = 0 ; j<arj[i].length; j++)
        {
            System.out.printf(" %d", arj[i][j]);
        }
        System.out.println();
    }   
    */
    
    
    //double [] ar = {1.2,2.2,3.4,4.2,2.1};
    //for(int i = 0; i<ar.length; i++)
      //  System.out.println(ar[i]);
    
      
      //Arraylist <String> snames = new Arraylist <String> ();
      int w = addmany(3,4,2,4,3,2);
      int x = addmany(4,4,4,4,4,4,4);
      System.out.println(w);
      System.out.println(x);
    }
public static int addmany(int ...a)
{
    int sum = 0; 
    for(int i = 0; i<a.length; i++)
        sum += a[i];
    return sum;
        
        
        
        
        
}
}
    

