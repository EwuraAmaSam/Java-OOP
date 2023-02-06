import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args){

        String myName;
        char myGender;
        int myAge;
        Scanner scan = new Scanner(System.in);

        // Taking inputs for name, age and gender
        System.out.print("Type your name: ");
        myName = scan.nextLine();
        
        System.out.print("Type your age: ");
        myAge = scan.nextInt();

        System.out.print("Type your gender: ");
        myGender = scan.next().charAt(0);
        
        //Creating an object 
        Person person = new Person();
        // Calling methods
        person.setPerson(myName, myAge, myGender);
        person.print();

        scan.close();
    }
}
