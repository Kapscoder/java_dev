import java.util.logging.Logger;

public class Cat extends Animal {

    private static final Logger logger = Logger.getLogger(Cat.class.getName());

    void eat(){
        logger.info("Cat.eat() called");
        System.out.println("cat is eating");
        logger.fine("Cat.eat() completed");
    }

    void speak(){
        logger.info("Cat.speak() called");
        System.out.println("cat is meowing");
        logger.fine("Cat.speak() completed");
    }
}
