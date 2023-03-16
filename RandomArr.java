/*
 * Write a Java program that creates an array of integers and fills it with 
 * random numbers between 1 and 100 (inclusive). Then, the program should 
 * display the contents of the array and 
 * calculate and display the average of all the elements in the array.
 */

public class RandomArr {

    public static void main(String[] args){

        int max = 100;
        int min = 1;
        int total = 0;

        int randIndex = (int)Math.floor(Math.random() *(max - min + 1));
        int[] arr = new int[randIndex];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.floor(Math.random() *(max - min + 1));
            total += arr[i];
        }
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]); 
        }

        double average;
        average = total/randIndex;
        System.out.println("The average is: " + average);



    }
    
}
