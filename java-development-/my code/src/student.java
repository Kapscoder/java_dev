public class student extends Person{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    student(String name, String lastname,int age,double gpa){
        super(name, lastname);
       
        this.age = age;
        this.gpa = gpa;
       
    }

    void showGPA(){
        System.out.println("GPA is " +gpa);
    }

    
}
