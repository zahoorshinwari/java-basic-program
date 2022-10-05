/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.list;
import java.util.*;

/**
 *
 * @author 92333
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        int nr , nc;
        nr = input.nextInt();
        nc = input.nextInt();
        int [][] mat = new int [nr][nc];
        for (int i = 0; i<nr; i++)
        {
            for ( int j = 0; j<nc; j++)
            {
                mat[i][j] = input.nextInt();
                
            }
        }
        for(int i = 0 ; i < nr ; i++)
        {
            for (int j = 0; j<nc; j++)
                
            {
                int sum = mat[i][j] + mat[i][j];
                System.out.printf(" %d   ", sum);
            }
        }
        
       
    }
    
}
