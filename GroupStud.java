// Write a Java program that creates an array of 5 integers and fills it with values 
// entered by the user. 
// Then, the program should display the sum of all the elements in the array.


import java.util.Scanner;

public class GroupStud {
   public static void main(String[] args){
    int[] arr = new int[5];
    int total = 0;
    int num_arr = 0; 
    int num;
    Scanner scan = new Scanner(System.in);

    while (num_arr != 5){
        System.out.print("Type a number: ");
        num = scan.nextInt();
        arr[num_arr] = num;
        total += num;
        num_arr++;
    }
    System.out.println("The total is: " + total);
   }
    
}
