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

        String productName;
        double productPrice;
        int productQuantity;
        double cost;

        System.out.print("Product name: ");
        productName = scan.nextLine();

        System.out.print("Price: ");
        productPrice = scan.nextDouble();

        System.out.print("Quantity: ");
        productQuantity = scan.nextInt();

        cost = productPrice * productQuantity;
        System.out.println("The cost is GHS " + cost);

        scan.close();
    
        
        
    }
}



