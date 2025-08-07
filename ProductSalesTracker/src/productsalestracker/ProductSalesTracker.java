package productsalestracker;

import java.util.Scanner;

public class ProductSalesTracker {

    public static void main(String[] args) {
        // 2 parallel arrays.
        // Display the product with the lowest and highest sales.
        // Allow the user to enter a product name and display how many units were sold.
        // If the product is not found display a suitable message.

        String[] products = {"Laptop", "Phone", "Tablet", "Monitor", "Keyboard"};
        int[] unitsSold = {30, 45, 25, 60, 40};

        System.out.println("Product Sales Tracker");
        System.out.println("---------------------\n");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + ": " + unitsSold[i] + " units");
        }

        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < unitsSold.length; i++) {
            
            if(unitsSold[maxIndex] < unitsSold[i]){
                maxIndex = i;
            }
            
            if(unitsSold[minIndex] > unitsSold[i]){
                minIndex = i;
            }
            
        }
        System.out.println("\n" + products[maxIndex] + " has the HIGHEST sales: " + unitsSold[maxIndex]);
        System.out.println(products[minIndex] + " has the LOWEST sales: " + unitsSold[minIndex]);
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter a product name: ");
        String product_name = kbd.next();
        
        
       

    } // end of main

} // end of class
