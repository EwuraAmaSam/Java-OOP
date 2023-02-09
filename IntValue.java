import java.util.Scanner;

/**
 * This class would have been useful for the assignment 1 such that,I could use it in 
 * setting the rules. I would create multiple objects from this class for each of the codes.
 * For example, an object could be created for the rule that the initial stones should be positive and odd.
 * Again, another object could be created for the rule that a player cannot pick more than twice what
 * the previous player took.
 * This class would also allow for code reusability and easy debugging of the code.
 **/
class IntValue{
    Scanner keyboard = new Scanner(System.in);
    int minValue;
    int maxValue;
    String prompt;
    int userValue;

    public void setInputParameters(int initMin, int initMax, String initPrompt){
        this.minValue = initMin;
        this.maxValue = initMax;
        this.prompt = initPrompt;
    }

    public void getValue(){
        System.out.print(prompt);
        userValue = keyboard.nextInt();
        
        // Checking if the user's input is within the range
        while(userValue > maxValue || userValue < minValue){
            System.out.println("Sorry. You have to choose another value.");
            System.out.print(prompt);
            userValue = keyboard.nextInt();
        }
        // Printing out the value
        System.out.println("The number is: " + userValue);

    }



}