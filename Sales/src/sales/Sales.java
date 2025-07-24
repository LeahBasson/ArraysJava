package sales;

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        // Declare an array of 5 double variables, called sales.
        // Read in 5 sales values from the user and store them in the sales array.
        // Calculate the average sales amount and display it on the screen.

        // How to check if its working first.
//        double[] sales1 = {50514.05, 31687.5, 26741.0, 45550.99, 63112.75};
//
//        System.out.println("\t\t\t SALES");
//        System.out.println("\t\t\t -----");
//        
//        for (int i = 0; i < sales1.length; i++) {
//            System.out.println((i + 1) + "\t\t\tR" + sales1[i]);
//        }
        Scanner kbd = new Scanner(System.in);

        double sales[] = new double[5];

        double avg = 0, sum = 0;

        for (int i = 0; i < sales.length; i++) {

            //Read in
            System.out.print("Enter sales amount " + (i + 1) + " : ");
            sales[i] = kbd.nextDouble();

            //sum calculation
            sum += sales[i];

            //calculate average
            avg = sum / sales.length;

        }

        System.out.println("\nThe average sales amount is R" + avg);

        System.out.println("\n");
        System.out.println("\t\t\t SALES");
        System.out.println("\t\t\t -----");

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= avg) {
                System.out.println((i + 1) + "\t\t\tR" + sales[i] + "*");
            } else {
                System.out.println((i + 1) + "\t\t\tR" + sales[i]);
            }
        }

        System.out.println("\n**** End of program ****");

    } //end of main

} //end of class
