package bmi;

public class BMI {
   
    private String bmiResult = "";


    public void setBMI(double height, double weight) {
        double bmi = weight/Math.pow(height, 2);

        if (bmi <= 18.5) {
            bmiResult= "underweight";
        } else if (bmi <= 25) {
            bmiResult= "normal";
        }else if (bmi <= 30) {
            bmiResult= "overweight";
        }else if (bmi > 30) {
            bmiResult= "obese";     
        }
    
    }

    public String getBMI () {
        return bmiResult;
    }

}
