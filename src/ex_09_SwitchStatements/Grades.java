package ex_09_SwitchStatements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade:");
        String grade = sc.next();
        grade=grade.toUpperCase();

        switch (grade) {

            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Very Good");
                break;

            case "C":
                System.out.println("Good");
                break;

            case "D":
                System.out.println("Needs Improvement");
                break;

            case "F":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
        }

    }

}