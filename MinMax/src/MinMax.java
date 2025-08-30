
import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = {5, 6, 1, 3, 9, 4};
        String[] names = new String[3];

        int add = 0;
        int cnt = 1;
        
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a name (type stop to finish): ");
        String name = kbd.next();

        while (!"stop".equals(name) && cnt < names.length) {
               
            names[add] = name;
            add++;
            cnt++;
            
            System.out.print("Enter a name (type stop to finish): ");
            name = kbd.next();
        }
        
//        for(int i = 0; i < names.length; i++){
//            System.out.println("Name: " + names[i]);
//        }
        
        System.out.println("names: " + Arrays.toString(names));

        int minNum = 0;
        int maxNum = 0;
        int sum = 0;

        // calculating sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Total: " + sum);

        // finding the max num
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxNum]) {
                maxNum = i;
            }
        }

        // finding the min num
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minNum]) {
                minNum = i;
            }
        }

        System.out.println("Max number: " + numbers[maxNum]);
        System.out.println("Min number: " + numbers[minNum]);

    } // end of main

} // end of class
