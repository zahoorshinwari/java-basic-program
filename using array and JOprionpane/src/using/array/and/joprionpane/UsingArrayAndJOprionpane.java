/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.array.and.joprionpane;
import java.util.*;
//import javax.swings.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 92333
 */
public class UsingArrayAndJOprionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int size;
        //System.out.print("Enter array size");
        //size = input.nextInt();
        String size_str = JOptionPane.showInputDialog(
                                    "Enter array size");
        size = Integer.parseInt(size_str);
        
        // Array creation
        int[] arr = new int[size];
        
        // Array input
        for(int i = 0; i < size; i++)
        {
            //System.out.print("Enter a number ");
            //arr[i] = input.nextInt();
            String ar_str = JOptionPane.showInputDialog("Enter a number");
            arr[i] = Integer.parseInt(ar_str);
        }
        
        // sum the elements
        int sum = 0;
        for(int i = 0; i < size; i++)
            sum += arr[i];

        double avg = (double) sum / size;
        //System.out.printf("Sum = %d, Avg = %f \n", 
        //                        sum, avg);
        String msg1 = String.format("Sum = %d, Avg = %f", sum, avg);
        JOptionPane.showMessageDialog(null, msg1);
        
///////////// Find the maximum value and index /////////
        int max_val = arr[0];
        int max_ind = 0;
        for(int i = 1; i < size; i++)
        {
            if(max_val < arr[i])
            {
                max_val = arr[i];
                max_ind = i;
            }
        }
        //System.out.printf("Max val = %d, index = %d \n",
         //                   max_val, max_ind);
         String msg2 = String.format("Max val = %d, index = %d", 
                                max_val, max_ind);
         JOptionPane.showMessageDialog(null, msg2);
////////////////////////////////////////////////////////

////// Find the index of a given value (Linear Search //////)
        int val, ind = -1;
        //System.out.print("Enter the value to find ");
        //val = input.nextInt();
        String val_str = JOptionPane.showInputDialog("Enter value to find");
        val = Integer.parseInt(val_str);
        
        for(int i = 0; i < size; i++)
        {
            if(val == arr[i])
            {
                ind = i;
                // break;   // For first occurance
            }
        }
        //System.out.printf("Index is %d \n", ind);
        String msg3 = String.format("Index is %d", ind);
        JOptionPane.showMessageDialog(null, msg3);
/////////////////////////////////////////////////////////////
    }
    
}
