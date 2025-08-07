package tut3.pkg4;

public class Tut34 {

    public static void main(String[] args) {
        // Two parallel arrays are to be used to store the surnames of fundraisers.
        // Respective amounts of funds.
        // display the surname and amount of the fundraiser that raised the most
        // display the surname and amount of the fundraiser that raised the least

        String[] surnames = {"Malan", "Jones", "West", "Nadile", "King", "Bester", "Peters", "Adams"};
        double[] amounts = {50000, 80000, 45000, 42000, 61000, 30000, 49000, 25000};

        System.out.println("Fundraiser \t\t Amount");

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
        System.out.println(surnames[maxIndex] + " raised the MOST funds: ");
        
         

    
    } //the end of main

} // the end of class
