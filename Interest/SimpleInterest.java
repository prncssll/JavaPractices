package Interest;
//encapsulation
public class SimpleInterest {


    private double principal, rate, time, simpleInterest;

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;

    }
    public void setTime(double time) {
        this.time = time;
        
    }
    public double getTime() {
        return time;
        
    }
    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    public double getPrincipal() {
        return principal;
    }
    
    public double computeSimpleInterest(){
        return simpleInterest = (principal*rate*time)/100;
    }

    
}
