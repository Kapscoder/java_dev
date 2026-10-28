public class Car{
    String modal;
    String colour;

     Car(String modal, String colour){
        this.modal = modal;
        this.colour = colour;

    }

    void display(){
        System.out.println("you drive a " + modal + " car and its colour is " + colour);
        
    }

}