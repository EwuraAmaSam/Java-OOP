import java.util.Scanner;

public class AssignmentOne{
    public static void main(String[] args)
    {
        // Initialising and declaring relevant variables
        String playerOne;
        String playerTwo;
        int initStones;
        int playerOneT = 0;
        int playerTwoT = 0;
        int pickOne;
        int pickTwo;
        int remainder;



        // Creating a Scanner object
        Scanner scan = new Scanner(System.in);

        // Taking players' names
        System.out.print("Player One, type your name: ");
        playerOne = scan.nextLine();
        System.out.println(" ");
        
        System.out.print("Player Two, type your name: ");
        playerTwo = scan.nextLine();
        System.out.println(" ");
        
        // Taking initial stones
        System.out.print("Type the initial number of stones: ");
        initStones = scan.nextInt();
        System.out.println(" ");
        
        // Controlling user's input for initial stones: Taking only odd and positive numbers
        while (initStones < 0 || initStones % 2 == 0)
        {
            System.out.println("Please type an odd and positive number.");
            System.out.print("Type the initial number of stones: ");
            initStones = scan.nextInt();
        } 
        remainder = initStones;
        
        // Prompting the user about the commencement of the game
        System.out.println(playerOne + " vs " + playerTwo);
        System.out.println("The Game Begins!");
        System.out.println(" ");

        
        // Initial Instance of the game (First Round)

        // Taking playerOne's input
        System.out.print(playerOne + " , pick some stones: ");
        pickOne = scan.nextInt();
        
        // Controlling what playerOne picks based on the rules of the game
        while (pickOne < 1 || pickOne > (remainder/2))
        {
            System.out.print(playerOne + ", please pick an appropriate number: ");
            pickOne = scan.nextInt();
        }
        // Incrementing the number of stones playerOne has
        playerOneT += pickOne;
        remainder -= pickOne;
        System.out.println("There are " + remainder + " stones left.");
        
        // Taking playerTwo's input
        System.out.print(playerTwo + " , pick some stones: ");
        pickTwo = scan.nextInt();
        
        
        // Controlling what playerTwo picks based on the rules of the game
        while (pickTwo > (2*pickOne) || pickTwo > remainder || pickTwo < 1)
        {
            System.out.print(playerTwo + ", please pick an appropriate number: ");
            pickTwo = scan.nextInt();  
        }
        // Incrementing the number of stones playerTwo has
        playerTwoT += pickTwo;
        remainder -= pickTwo;
        System.out.println("There are " + remainder + " stones left.");
        System.out.println(playerOne + " has " + playerOneT + " stones. " + playerTwo + " has " + playerTwoT + " stones.");


        // Subsequent Instances after the first round
        while (remainder > 0)
        {
            System.out.print(playerOne + " , pick some stones: ");
            pickOne = scan.nextInt();
            
            while (pickOne < 1 || pickOne > (2 * pickTwo) || pickOne > remainder)
            {
                System.out.print(playerOne + ", please pick an appropriate number: ");
                pickOne = scan.nextInt();
            }

            playerOneT += pickOne;
            remainder -= pickOne;
            System.out.println("There are " + remainder + " stones left.");
            
            if (remainder == 0)
            {
                break;
            }

            System.out.print(playerTwo + " , pick some stones: ");
            pickTwo = scan.nextInt();
            
            while (pickTwo > (2*pickOne) || pickTwo > remainder || pickTwo < 1)
            {
                System.out.print(playerTwo + ", please pick an appropriate number: ");
                pickTwo = scan.nextInt();  
            }
            playerTwoT += pickTwo;
            remainder -= pickTwo;
            System.out.println("There are " + remainder + " stones left.");
            System.out.println(playerOne + " has " + playerOneT + " stones. " + playerTwo + " has " + playerTwoT + " stones.");
        }

        System.out.println(playerOne + " has " + playerOneT + " stones. " + playerTwo + " has " + playerTwoT + " stones.");

        // Declaring the winner based on the one with most stones
        if (playerOneT > playerTwoT)
        {
            System.out.println(playerOne + " wins.");
        }
        else{
            
            System.out.println(playerTwo + " wins.");
        }

        // Closing the scanner object
        scan.close();
    }
}