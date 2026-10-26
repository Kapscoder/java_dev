public class main {

    public static void main(String[] args){

        //constructor = A special method that is called when an object is instantiated
       //                 A constuctor is used to initialize the object
       //               you cam pass parameters to a constructor to initialize attributes and set up the value

        student student1=new student("kapil",20,3.5);

        student student2=new student("sachin",21,3.8);

        System.out.println(student1.name);
        System.out.println(student2.name);


        //overloaded constructor = multiple constructors within a class with the same name but have different parameters
        //enabled us to create different ways to initialize an object


        //static =makes a variable or method belong to the class as a whole instead of an object
        //commonly used for utility or helper methods, such as Math.random() and Math.pow()
    }
}