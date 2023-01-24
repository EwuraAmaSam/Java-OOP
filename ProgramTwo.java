import java.util.Scanner;
public class ProgramTwo {
    public static void main(String[] args){
        // Declaring Variables
        int n;
        double totalPoints = 0;
        double totalCredits = 0;
        double credits;
        String letterGrade;
        double points ;
        double GPA;

        System.out.print("How many classes did you take last semester?: ");
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        
        for (int i= 1; i<n+1; i++)
        {
            System.out.print("How many credits was course " + i + "?: ");
            credits = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("What was your letter grade?: ");
            letterGrade = keyboard.nextLine();
            if (letterGrade.equals("A"))
            {
                points = 4.0;
            }
            else if (letterGrade.equals("B+"))
            {
                points = 3.5;
            }
            else if (letterGrade.equals("B"))
            {
                points = 3.0;
            }
            else if (letterGrade.equals("C+"))
            {
                points = 2.5;
            }
            else if (letterGrade.equals("C"))
            {
                points = 2.0;
            }
            else if (letterGrade.equals("D+"))
            {
                points = 1.5;
            }
            else if (letterGrade.equals("D"))
            {
                points = 1.0;
            }
            else 
            {
                points = 0;
            }
            totalCredits += credits;
            totalPoints += points*credits;

        }
        GPA = totalPoints / totalCredits;
        System.out.println("You took " + totalCredits + " credits.");
        System.out.println("Your GPA is " + GPA);



    }
    
}
