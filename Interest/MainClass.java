package Interest;
import java.util.Scanner;

public class MainClass {
    Scanner sc = new Scanner(System.in);
    SimpleInterest si = new SimpleInterest();
    public static void main(String[]args) {
        CompoundInterest co = new CompoundInterest();
        co.queryInput();
        co.displayOutput();
    }

    // public void startProgram(){
    //     queryInput();
    //     displayOutput();
    // }

    // public void queryInput(){
    //     System.out.print("Enter the principal: ");
    //     double principal = sc.nextInt();
    //     si.setPrincipal(principal);
    //     System.out.print("Enter the rate: ");
    //     double rate = sc.nextInt();
    //     si.setRate(rate);
    //     System.out.print("Enter the time: ");
    //     double time = sc.nextInt();
    //     si.setTime(time);
    // }

    // public void displayOutput(){
    //     System.out.println("Principal: " + si.getPrincipal());
    //     System.out.println("Interest rate: " + si.getRate());
    //     System.out.println("Time Duration: " + si.getTime());
    //     System.out.println("Simple Interest: " + si.computeSimpleInterest());
    // }
   
}

