package MaximumEdgeOfATriangle;

public class EdgeOfTriangle {
    private double maxEdgeOfTriangle = 0;

    public void setMaximumEdge(double sideOne, double sideTwo){
        maxEdgeOfTriangle = (sideOne + sideTwo) -1;
    }

    public double getMaximumEdge(){
        return maxEdgeOfTriangle;
    }
}
