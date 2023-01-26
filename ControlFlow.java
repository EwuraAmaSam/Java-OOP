// Check Github for task 1
// Gracefully handle type mismatch input
// Look into exceptions

import java.util.Scanner;

public class ControlFlow {
    public static void main (String[] args){

        // EXAMPLE ONE - If-Else Statements

        // GPA Calculations
        // Declaring variables
        double GPA;

        Scanner scan = new Scanner(System.in);
        System.out.print("Type in your GPA: ");
        GPA = scan.nextDouble();


        
        if (GPA >= 3.85 && GPA <= 4.0)
        {
            System.out.print("You had a Summa Cum Laude ");
        }

        if (GPA >= 3.70 && GPA < 3.85)
        {
            System.out.print("You had a Magna Cum Laude ");
        }

        if (GPA >= 3.50 && GPA < 3.70)
        {
            System.out.print("You had a Cum Laude ");
        }

        if (GPA >= 3.00 && GPA < 3.50)
        {
            System.out.print("You had Second Class(Upper) ");
        }

        if (GPA >= 2.75 && GPA < 3.00)
        {
            System.out.print("You had Second Class(Lower) ");
        }

        if (GPA >= 2.50 && GPA < 2.75)
        {
            System.out.print("You had Third Class ");
        }

        if (GPA >= 2.25 && GPA < 2.50)
        {
            System.out.print("You passed");
        }

        if (GPA < 2.25 )
        {
            System.out.print("You failed. ");
        }

        scan.close();

        
        // EXAMPLE TWO: TRAFFIC LIGHT (Switch Case)
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("State of Traffic: ");
        String state = keyboard.next();


        switch(state)
        {
            case("r"): System.out.println("Stop");
            break;

            case("y"): System.out.println("Slow Down");
            break;

            case("g"): System.out.println("Go");
            break;

        }
        keyboard.close();
        
        


    }
}
