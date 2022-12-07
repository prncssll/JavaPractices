package integers;
import java.util.ArrayList;
import java.util.Scanner;

//using methods
public class Integers {
    int i, numberOfIntegers , num, squaredNum, sum; 
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    public void startProgram(){
        queryInput();
        promptInputQuestion();
        printAnswers();
    }

    public void queryInput(){
        System.out.print("Enter number of integers: ");
        numberOfIntegers = sc.nextInt();
    }

    public void promptInputQuestion(){
        System.out.print("Enter " + numberOfIntegers + "integers: ");
        for(i=0;i<numberOfIntegers;i++){
            num = sc.nextInt();
            numbers.add(num);
        }
    }

    public void printAnswers(){
        for(i=0;i<numberOfIntegers;i++){
            squaredNum = (int) Math.pow(numbers.get(i), 2);
            sum += squaredNum;
            System.out.println(numbers.get(i) + " squared is: " + squaredNum );
        }
        System.out.println("Sum is: " + sum);
    }
    
}
