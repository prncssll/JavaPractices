package MaximumEdgeOfATriangle;
import java.util.Scanner;

public class Main {
    double sideOne, sideTwo;
    Scanner in = new Scanner (System.in);
    EdgeOfTriangle edge = new EdgeOfTriangle();

    public static void main(String[]args) {
        Main main = new Main();
        main.startProcess();
    }

    private void startProcess() {
        queryInput();
        edge.setMaximumEdge(sideOne, sideTwo);
        System.out.println("Maximum Edge of Triangle: " + edge.getMaximumEdge());
    }

    private void queryInput(){
        System.out.print("Enter Side 1 of triangle: ");
        sideOne = in.nextDouble();
        System.out.print("Enter Side 2 of triangle: ");
        sideTwo = in.nextDouble();
    }
}
