import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Side's Measurement: ");
        int side1 = sc.nextInt();
        System.out.println("The Second Side's Measurement: ");
        int side2 = sc.nextInt();
        System.out.println("The Third Side's Measurement: ");
        int side3 = sc.nextInt();

        if(side1+side2>side3 || side2+side3>side1 || side3+side1>side2) {
            if(side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("The Triangle is an Equilateral Triangle");
            }
            else if(side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("The Triangle is an Isosceles Triangle");
            }
            else if(side1 != side2 && side2 != side3 && side3 != side1); {
                System.out.println("The Triangle is a Scalene Triangle");
            }
        }
        else {
            System.out.println("These measurements do not form a Triangle!");
        }
        System.out.println("Hope I worked well\nThank You for using me!");
    }
}