import java.util.Scanner;

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