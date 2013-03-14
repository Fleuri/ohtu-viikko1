/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjainneliö;
import java.util.Scanner;

/**
 *
 * @author lauri
 */
public class Kirjainneliö {

    /**
     * @param args the command line arguments
     */

       public static void main(String[] args) {
        // TODO code application logic here
        String aakkoset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner scn = new Scanner(System.in);
           System.out.println("Anna numero");
        int digit = scn.nextInt();
        digit = digit * 2 - 1; 
        
        for (int i = 0; i < digit; i++) {
            System.out.println("");
            for (int j = 0; j < digit; j++) {
                System.out.print(aakkoset.charAt(Math.min(Math.min(i, j),(Math.min(digit-j-1, digit-i-1)))));
            }
        }
    }
}
