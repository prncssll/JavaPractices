package PrimeNumberChecker;
import java.util.Scanner;

public class PrimeChecker {
    int i, num;
    boolean isNotPrime;

    Scanner sc = new Scanner(System.in);

    public void queryInput(){
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        primeChecker(num);
    }

    public void primeChecker(int num){
        if(num<=1) isNotPrime = false;
        for(i = 2 ; i <= num/2 ; ++i){
            if(num % i == 0) isNotPrime= true;
            break;
        }
    }

    public void printResult(){
        if(isNotPrime==false)System.out.println(num +" is a prime number.");
        else System.out.println(num+ " is not a prime number.");
    }
}

