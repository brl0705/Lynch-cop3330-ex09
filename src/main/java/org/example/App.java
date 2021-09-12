package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        int sf;
        int simpleG;
        double gallons;

        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the area of wall you are trying to paint? (In square feet)");
        sf = input1.nextInt();

        gallons = sf/350;
        simpleG = sf/350;

        double x = gallons-simpleG;

        if(x>0)
        {
            double y=1-x;
            double rounded=y+gallons;

            System.out.println("You will need to purchase " + rounded + " gallons of paint to cover " + sf + " square feet.");
        }
        else if(x==0)
        {
            System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + sf + " square feet.");

        }


    }
}
