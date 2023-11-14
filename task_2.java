package codsoft2;
import java.util.Scanner;

public class task_2 {
	
	public class GradeCalc {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("----Welcome to student grade calculator----\n ");

	        int num;
	        do 
	        {
	            System.out.print("Enter the number of subjects: ");
	            num = scanner.nextInt();
	        } 
	        while (num <= 0);

	        int[] marks = new int[num];
	        for (int i = 0; i < num; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	        
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }

	        
	        double avgpercentage = (double) total / num;

	       
	        char grade = calcgrade(avgpercentage);

	        
	        System.out.println("\n-------------");
	        System.out.println("Your results:");
	        System.out.println("Total Marks: " + total);
	        System.out.printf("Average Percentage: %.2f ",avgpercentage);
	        System.out.println("%");
	        System.out.println("Grade: " + grade);

	        
	        scanner.close();
	    }

	    
	    private static char calcgrade(double averagePercentage) {
	        if (averagePercentage >= 90) 
	            return 'A';
	        else if (averagePercentage >= 80) 
	            return 'B';
	        else if (averagePercentage >= 70) 
	            return 'C';
	        else if (averagePercentage >= 60) 
	            return 'D';
	        else 
	            return 'F';
	        
	    }
	}

}
