public class main {

    public static void main(String[] args){

        //constructor = A special method that is called when an object is instantiated
       //                 A constuctor is used to initialize the object
       //               you cam pass parameters to a constructor to initialize attributes and set up the value

        // student student1=new student("kapil",20,3.5);

        // student student2=new student("sachin",21,3.8);

        // System.out.println(student1.name);
        // System.out.println(student2.name);


        //overloaded constructor = multiple constructors within a class with the same name but have different parameters
        //enabled us to create different ways to initialize an object


       

        // Car car1=new Car("BMW","Black");
        // Car car2=new Car("Audi","white");
        // Car car3=new Car("Mercedes","Red");
        // Car [] cars={car1,car2,car3};

        // for(Car car:cars){
        //     car.display();
        // }

         //static =makes a variable or method belong to the class as a whole instead of an object
        //commonly used for utility(RANDOM, POW ) or helper methods, such as Math.random() and Math.pow()

        // Friend friend1=new Friend("kapil");
        // Friend friend2=new Friend("sachin");    
        // Friend friend3=new Friend("rohit");
        // friend1.display();


      //  ----------------------------------------------------------------------------------------------//
       //Inheritance ->One class inherits the attributes and methods from another class
       //  parent class = the class being inherited from (superclass)
       //child class <- parent class

    //    Dog dog1=new Dog();
    //    Cat cat1=new Cat();
    //    dog1.speak();
    //    cat1.speak();
    //    dog1.eat();
    //    cat1.eat();



       //  ----------------------------------------------------------------------------------------------//
       
       Person person1=new Person("ashish","kumar");
       person1.showname();

       student student1=new student("anuj","singh",20,3.5);
       student1.showGPA();
  //-----------------------------------------------------------------------------------------//

       Car car1=new Car("BMW","Black","X5","2020");
       System.out.println(car1);
    }

    

}
class Animal{
        boolean isAlive;

        Animal(){
            isAlive=true;
        } 
        void eat(){
            System.out.println("Animal is eating");
        }
    }
     
    //super  is a keyword that refers to the superclass (parent) of an object
    //used in constructors and methods to access attributes and methods of the parent class

    class  Person{
         String Fname;
         String Lname;

         Person(String Fname,String Lname){
            this.Fname=Fname;
            this.Lname=Lname;
         }
         void showname(){
            System.out.println("First name is " +Fname + " Last name is " +Lname);
         }

    }



    //toString() = special method that all objects inherit, used to return a string that "textually represents" an object
    //can be used both implicitly and explicitly
    //by default, the toString() method returns the name of the class and a hashcode of the object

    //  class Car{
    //     String make;
    //     String color;
    //     String model;
    //     String year;

    //     Car(String make,String color,String model,String year){
    //         this.make=make;
    //         this.color=color;
    //         this.model=model;
    //         this.year=year;
    //     }

    //     @Override
    //     public String toString(){
    //         return "Car make is " +make + " color is " +color + " model is " +model + " year is " +year;
    //     }

    // }


//------------------------------------------------------------------------------------------//
    //abtract - used to define abstract classes and methods
   //abtraction -is the process of hinding the implementation details and showing only essential features of the object
   //Abstract class = a class that cannot be instantiated, may contain abstract methods (methods without a body)
   // can contain both abstract and concrete methods (methods with a body)

   Circle circle1=new Circle();
   Triangle triangle1=new Triangle();
