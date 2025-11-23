import java.util.Scanner;

public class Sgc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects :");
        int l=sc.nextInt();
        long tempMarks[] = new long[l];
        long totalMarks=0;
        for(int i=0;i<l;i++){
            System.out.println("Enter the #"+(i+1)+" subject Marks : ");
            tempMarks[i]=sc.nextLong();
        }
        for(int i=0;i<l;i++){
            totalMarks+=tempMarks[i];
        }
        if (l <= 0) {
            System.out.println("Number of subjects must be a positive integer.");
            sc.close();
            return;
        }
        double percentage = (double) totalMarks / l;
        char grade;
        if (percentage >= 90.0) {
            grade = 'A';
        } else if (percentage >= 80.0) {
            grade = 'B';
        } else if (percentage >= 70.0) {
            grade = 'C';
        } else if (percentage >= 60.0) {
            grade = 'D';
        } else if (percentage >= 50.0) {
            grade = 'E';
        } else if (percentage >= 40.0) {
            grade = 'G';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks Awarded: "+totalMarks);
        System.out.println("Average Percentage: "+percentage);
        System.out.println("Grade Awarded: "+grade);
        sc.close();
    }
}
