package CalculateAverageTemp;
import java.util.Scanner;
public class AvgTemp{
    double [] temp;

    public AvgTemp (){
        temp = new double[5];
    }

    public double getAverageTemp(double[] temp){
        double sum = 0.0;
        for(int i = 0; i < temp.length; i++){
            sum += temp[i];
        }
        return sum / temp.length;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AvgTemp t = new AvgTemp();

        for(int i = 0; i < t.temp.length; i++){
            System.out.print(" Enter Temperature: ");
            t.temp[i] = input.nextDouble();
        }

        double average = t.getAverageTemp(t.temp);
        System.out.println("Average Temperature: " + average);


    }
}
