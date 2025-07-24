
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        // User must input an integer value that represents a price 5 times.
        // Store the values in an array. Code a for-loop.
        // Code another for-loop to calculate the sum of all the values entered.
        // Calculate and print the average.

        Scanner input = new Scanner(System.in);

        double price[] = new double[5];
        

        for (int i = 0; i < price.length; i++) {
            System.out.print("Enter price " + (i + 1) + ": " );
            price[i] = input.nextDouble();
        }
        
        double sum = 0, average = 0;
        
        for (int i = 0; i < price.length; i++){
            sum += price[i];
            average = sum/price.length;
        }
        
        System.out.println("The average is " + average);
        
    }

}
