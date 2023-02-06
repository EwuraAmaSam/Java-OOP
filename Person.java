// import java.util.Scanner;

public class Person {
    String name;
    int age;
    char gender;

    // Scanner scan = new Scanner(System.in);

    // Getter and Setter for name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    // Getter and Setter for age
    public void setAge(int Age){
      this.age = Age;
    }

    public int getAge(){
        return age;
    }
    
    // Getter and Setter for gender
    public void setGender(char Gender){
        this.gender = Gender;
    
    }

    public String getGender(){
        
        return name;
    }

    // Method to set name, age and gender
    public void setPerson(String initName, int initAge, char initGender){
        setName(initName);
        
        if (initAge>0 && (Character.toLowerCase(initGender)=='f'||Character.toLowerCase(initGender)=='m')){
            setAge(initAge);
            setGender(initGender);
            
        }
        else{
            System.exit(-1);
        }


    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

    }    
}
