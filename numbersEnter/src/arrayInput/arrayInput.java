
package arrayInput;

import java.util.Arrays;
import java.util.Scanner;


public class arrayInput {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // array of size 5

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt(); // read user input
        }
        System.out.println("numbers: " + Arrays.toString(numbers));
  
        String[] names = new String[5];
        
        for(int i = 0; i < names.length; i++){
            System.out.print("Enter a name: ");
            names[i] = sc.next();
        }
        System.out.println("names: " + Arrays.toString(names));
    } // end of main
    
} // end of class
