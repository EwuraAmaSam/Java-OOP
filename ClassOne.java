/*
 @author Ewura Ama Etruwaa Sam
 Version 1.0.0
*/

import java.util.Scanner;


public class ClassOne{
    public static void main(String[] args){
        byte byteNumber = 4;
        short shortNumber = 8;
        int intNumber = 16;
        double doubleNum = 32;
        char character = 'O';
        String isStud;
        

        
        int numOne;
        int numTwo;
        int sum;
        
        
        System.out.println("byteNumber is: " + byteNumber);
        System.out.println("shortNumber is: " + shortNumber);
        System.out.println("intNumber is: " + intNumber);
        System.out.println("doubleNum is: " + doubleNum);
        System.out.println("character is: " + character);
        System.out.println(" ");
        
        // Variable Widening
        intNumber = shortNumber;
        System.out.println("New Integer number: " + intNumber);
        
        // Type casting
        // byteNumber = doubleNum; throws a warninh
        byteNumber = (byte)doubleNum;
        System.out.println("New byteNumber: " + byteNumber);
        
        // intNumber = (int)character;
        // System.out.println("New intNumber: " + intNumber);
        
        // Create the scanner object to take input from keyboard
        Scanner scan = new Scanner(System.in);

        // Input from keyboard using scanner object
        System.out.print("Type a number: ");
        numOne = scan.nextInt();
        
        System.out.print("Type another number: ");
        numTwo = scan.nextInt();
        
        sum = numOne + numTwo;
        System.out.println("The sum is: " + sum);


        // Essentials
        String productName;
        double productPrice;
        int productQuantity;
        double cost;
        double discounted;

        System.out.print("Product name: ");
        productName = scan.nextLine();
        scan.next();
        System.out.println(" ");

        System.out.print("Price: ");
        productPrice = scan.nextDouble();
        
        System.out.print("Quantity: ");
        productQuantity = scan.nextInt();
        
        // System.out.println("The cost is GHS " + cost);
        
        System.out.print("Are you a student? y/n: ");
        isStud = scan.next();
        scan.nextLine();
        
        if (isStud.equals("y"))
        {
            cost = productPrice * productQuantity;
            discounted = cost - (0.25*cost);
            System.out.println("The cost is: GHC" + discounted);
        } 
        
        else{
            cost = productPrice * productQuantity;
            System.out.println("The cost is: GHC " + cost);

        }



        scan.close();
    
        
        
    }
}



