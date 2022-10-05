/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square.of.each.element.in.array;
/**
 *
 * @author 92333
 */
        import java.util.*;
public class SquareOfEachElementInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            Scanner input = new Scanner (System.in);
		int size;
		System.out.println("enter array size ");
		size = input.nextInt();
		int[] myar = new int[size];
		for(int i = 0; i < myar.length; i++)                            // mayar.length will goes upto the size of array that user can enter
                                                                                // if size is 3 then the loop will contnue upto 3 time and then terminated
		{
			System.out.println("enter a number");
			myar[i] = input.nextInt();
			
		}

			Squarearray(myar);
			for(int p:myar)
			System.out.println(p);
			int x = 8;
			squareval(x);
			System.out.println(x);
		

    }

		public static void Squarearray(int [] ar)
			{
				for(int i = 0; i < ar.length; i++)              // here ar 0 is equal to first value that we enter to the array in the size and 2nd and 3rd value that we enter to the array 
				ar [i] *= ar [i];
			}

		public static void squareval(int v)
			{
				v *= v; 
				System.out.println(v);
			}

    }
    




