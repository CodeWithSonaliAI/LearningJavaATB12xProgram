package Tasks;


import java.util.Scanner;

public class Task5_Triangle_Classification {
    public static void main(String[] args) {
        System.out.println("Enter length of three sides of Triangle");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Side 1");
        int side1 = scanner.nextInt();

        System.out.println("Side 2");
        int side2 = scanner.nextInt();

        System.out.println("Side 3");
        int side3 = scanner.nextInt();

        if ((side1 == side2) && (side2 == side3)) {
            System.out.println("This is an equilateral triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            System.out.println("This is an isosceles triangle");
        } else {
            System.out.println("This is a scalene triangle");
        }
    }
}
