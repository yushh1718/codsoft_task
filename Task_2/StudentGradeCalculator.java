package Task_2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void studentGradeCalculator(int s1, int s2, int s3, int s4, int s5){
        //calculating total marks.
        int totalMarks = s1+ s2+ s3+ s4+ s5;
        System.out.println("Total marks obtained: "+ totalMarks);

        //calculating average.
        int avg = (totalMarks)/5;
        System.out.println("Average marks of 5 subjects is: "+ avg);

        //calculating grade on the basis of average obtained.
        if (avg >=90 && avg <100){
            System.out.println("Grade obtained: A+");
        } else if (avg >=80 && avg <90) {
            System.out.println("Grade obtained: A");
        } else if (avg >=70 && avg <80) {
            System.out.println("Grade obtained: B+");
        }else if (avg >=60 && avg <70) {
            System.out.println("Grade obtained: B");
        } else if (avg >=50 && avg <60) {
            System.out.println("Grade obtained: C+");
        } else if (avg >=40 && avg <50) {
            System.out.println("Grade obtained: C");
        } else if (avg >=30 && avg <40) {
            System.out.println("Grade obtained: C#");
        } else {
            System.out.println("Grade obtained: F");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects out of 100: ");
        System.out.print("Marks of S1: ");
        int s1 = sc.nextInt();
        System.out.print("Marks of S2: ");
        int s2 = sc.nextInt();
        System.out.print("Marks of S3: ");
        int s3 = sc.nextInt();
        System.out.print("Marks of S4: ");
        int s4 = sc.nextInt();
        System.out.print("Marks of S5: ");
        int s5 = sc.nextInt();
        System.out.println();

        studentGradeCalculator(s1, s2, s3, s4, s5);

    }
}