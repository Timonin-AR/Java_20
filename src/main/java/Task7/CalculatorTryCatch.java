package Task7;

import Task5.Canculator.Division;

import java.io.IOException;

public class CalculatorTryCatch {


    public static void main(String[] args) throws IOException {
        try {
            System.out.println(Division.Act(2,0));
        }
        catch (Exception e)
        {
            System.out.println("Делить на нуль нельзя... Ебобо?");
        }


    }




}
