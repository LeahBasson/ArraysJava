package successsummary;

public class SuccessSummary {

    public static void main(String[] args) {
        // Define and initialize an array with 15 student names.
        // Define and initialize an array with 15 marks.
        // Display the average mark.
        // Display the number of students that failed and the number of students that passed.
        // Display the pass-rate percentage.
        // Display the student with the highest mark. Include his/her mark
        // Display the number of students that received more than 75%.
        // Display the average pass-rate percentage.
        // This is calculated as the average mark of all student that passed (mark >= 50).

        String[] students = {"Leah", "Tristan", "Reece", "Jamin", "Keziah", "Tamia", "Faadia", "Kiyarah", "Caitlyn", "Emily", "Zoe", "Katelin", "Tarryn", "Lynn", "Leslie"};
        double[] marks = {40, 90, 70, 82, 85, 95, 35, 84, 83, 82, 87, 46, 92, 78, 89};

        double sum = 0, avg = 0, passed_cnt = 0, pass_pct, failed_cnt = 0, num_of_75 = 0, sum_pass = 0, avg_rate = 0;
        
        double highest_mark = marks[0];
                
        int position = 0;
         
        
        for (int i = 0; i < marks.length; i++) {

            sum += marks[i];
             
            if (marks[i] < 50) {
                failed_cnt++;
            }
            
            if (marks[i] >= 50){
                passed_cnt++;
                sum_pass += marks[i];
            }
            
            if (marks[i] > highest_mark){
                highest_mark = marks[i];
                position = i;
            }
            
            if (marks[i] > 75){
                num_of_75++;
            }

        }

        System.out.println("\tSuccess Summary");
        
        // avg
        avg = sum / marks.length;
        System.out.printf("Average mark: " + "%.2f%n", avg);
        
        // number of students that passed/failed.
        System.out.println("Number of students that failed: " + failed_cnt);
        System.out.println("Number of students that passed: " + passed_cnt);
        
        // pass-rate percentage
        double pass_cal = passed_cnt / marks.length;
        pass_pct = pass_cal * 100;
        System.out.println("Pass-rate percentage: " + pass_pct);
        
        // highest mark
        System.out.println("The student with the highest mark is: " + students[position]);
        System.out.println("The highest mark: " + highest_mark);
        
        // number of students that received more than 75%
        System.out.println("Number of students that received more than 75%: " + num_of_75);
        
        // avg pass-rate percentage
        avg_rate = sum_pass / passed_cnt;
        System.out.println("Average pass-rate percentage: " + avg_rate);
        
    }//end of main

}//end of class
