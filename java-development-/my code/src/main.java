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

       Dog dog1=new Dog();
       Cat cat1=new Cat();
       dog1.speak();
       cat1.speak();
       dog1.eat();
       cat1.eat();
       

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