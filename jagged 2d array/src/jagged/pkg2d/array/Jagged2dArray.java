/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jagged.pkg2d.array;
import java.util.Scanner;

/**
 *
 * @author 92333
 */
public class Jagged2dArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);        
           int arj[][] = new int[5][];
 
        // Making the above array Jagged
 
         //First row has 5 columns
        arj[0] = new int[1];
        arj[1] = new int[4];
        arj[2] = new int[6];
        arj[3] = new int[2];
        arj[4] = new int[1];
        // Initializing array
        
        for (int i = 0; i < arj.length; i++)
            for (int j = 0; j < arj[i].length; j++)
                arj[i][j] = input.nextInt();
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arj.length; i++) {
            for (int j = 0; j < arj[i].length; j++)
                System.out.printf(" %d " , arj[i][j] );
            System.out.println();
        }
         
      
    }
    
    }
