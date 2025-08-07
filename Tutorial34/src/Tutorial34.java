
import java.util.Scanner;

public class Tutorial34 {

    public static void main(String[] args) {
        // Two parallel arrays are to be used to store the surnames of fundraisers.
        // Respective amounts of funds.
        // display the surname and amount of the fundraiser that raised the most
        // display the surname and amount of the fundraiser that raised the least
        // Input a surname from the user and display the amount they raised, if found in array.
        Scanner kbd = new Scanner(System.in);

        String[] surnames = {"Malan", "Jones", "West", "Nadile", "King", "Bester", "Peters", "Adams"};
        double[] amounts = {50000, 80000, 45000, 42000, 61000, 30000, 49000, 25000};

        System.out.println("Fundraiser \t\tAmount");

        for (int i = 0; i < surnames.length; i++) {
            System.out.println(surnames[i] + "\t\t\t" + amounts[i]);
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < amounts.length; i++) {

            if (amounts[maxIndex] < amounts[i]) {
                maxIndex = i; // index you are comparing to.  
                //System.out.println(surnames[maxIndex]+" maxIndex = "+maxIndex+" = "+ amounts[maxIndex]);
            }

            //It goes through the loop and everytime the amount gets lower it changes the index.
            if (amounts[minIndex] > amounts[i]) {
                minIndex = i; //index you are comparing to.  
                //System.out.println(surnames[minIndex]+ " minIndex = "+minIndex+" = "+ amounts[minIndex]);
            }
        }
        System.out.println("\n" + surnames[maxIndex] + " raised the MOST funds: R" + amounts[maxIndex]);
        System.out.println(surnames[minIndex] + " raised the LEAST funds: R" + amounts[minIndex]);

        System.out.print("\nPlease enter a surname: ");
        String name = kbd.next();

        boolean found = false;
        int indexFound = 0;

        while ((indexFound < amounts.length) && (!found)) {
            if (surnames[indexFound].equals(name)) {
                found = true;
            } else {
                indexFound++;
            }
        }
        if (found){
            System.out.println(name + " found - they raised R" + amounts[indexFound]);
        } else{
            System.out.println("Name not found."); 
        }

    }// end of main

}// end of class
