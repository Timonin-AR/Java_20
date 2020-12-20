package Canculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calculator {


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
