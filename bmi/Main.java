package bmi;
 
import java.util.Scanner;
public class  Main {
    public static void main(String[]args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter weight: ");
    double weight = in.nextDouble();
    System.out.print("Enter height: ");
    double height = in.nextDouble();

    BMI bmi = new BMI();
    
    bmi.setBMI(height, weight);

    System.out.println("Your result is : " + bmi.getBMI());
    

    
    }
}
