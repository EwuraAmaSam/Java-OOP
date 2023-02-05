public class Student {
    String name;
    int age;

    Student(String name){
        this.name = name;
    }

    // Constructors
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    String studentInfo(){
        return "name: " + this.name + "age: " + this.age;
    }



    public static void main(String[] args){
        Student Ewura = new Student("Ewura Ama");
        System.out.println(Ewura.studentInfo());
        Student Sam = new Student("Sam", 21);
        System.out.println(Sam.studentInfo());

    }
    
}
