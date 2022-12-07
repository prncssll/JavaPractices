package Interest;
import java.util.Scanner;
//methods
public class CompoundInterest {

    Scanner sc = new Scanner(System.in);

    double principal, rate, time, numOfTimesInterest, compoundInterest;

    public void queryInput(){
        System.out.print("Enter the principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter the rate: ");
        rate = sc.nextDouble();
        System.out.print("Enter the time: ");
        time = sc.nextDouble();
        System.out.print("Enter the number of times interest is compounded: ");
        numOfTimesInterest = sc.nextDouble();
    }
    
    public double computeCompoundInterest(){
        return compoundInterest =(principal *Math.pow((1+rate/100),time*numOfTimesInterest)-principal); 
    }

    public void displayOutput(){
        System.out.println("Principal: " + principal);
        System.out.println("Interest rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("NUmber of times Interest is compunded: " + numOfTimesInterest);
        System.out.println("Compund interest: " + computeCompoundInterest());
    }
}
