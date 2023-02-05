import java.util.Scanner;
public class ProgramOne{
    public static void main(String[] args){
        System.out.println("Enter a list of positive numbers, one per line.");
        System.out.println("Use a negative number to indicate the end of input.");
        // Declaring and initialising variables
        int num; 
        int even = 0;
        int odd = 0;
        int zeros = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        num = keyboard.nextInt();
        
        while (num >= 0)
        {
            if (num == 0)
            {
                zeros +=1;
            }
            else if ((num % 2) == 0 )
            {
                even += 1;
            }
            else
            {
                odd += 1;
            }
            
            num = keyboard.nextInt();
        }
        
        System.out.println("Thank you!");
        System.out.println("You entered" + " " + even + " even numbers and " + odd + " odd numbers and " + zeros+ " " + "zeros.");
    
        keyboard.close();
    }
}

/*git remote add origin https://github.com/EwuraAmaSam/Java-OOP.git
PS C:\Users\nuthi\OneDrive\Desktop\OOP> git branch -M main
PS C:\Users\nuthi\OneDrive\Desktop\OOP> git push -u origin main */