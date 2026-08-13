package dependency_injection;

public class Car {

    // Interface reference variable can hold any of its implementation class object.
    private EngineInterface engineInterface;

    // Constructor injection. Used parameterised constructor.
    // Here we have not used spring yet as dependency injection can be done without spring
    Car(EngineInterface engineInterface){
        this.engineInterface = engineInterface;
    }

    // Default constructor.
    // Here default constructor is just used to create Car object without passing any constructor argument
    // So that we can simply create Car object and set the engineInterface reference variable by using setter method
    Car(){

    }

    public void setEngineInterface(EngineInterface engineInterface){
        this.engineInterface = engineInterface;
    }

    public void drive(){

        // If we directly call start method using interface reference variable we will get null pointer exception.
        // Because the engineInterface reference was not initialised.
        // At this point explicit constructors were not there.
//        boolean status = engineInterface.start();

        boolean status = engineInterface.start();

        if (status){
            System.out.println("Journey started...");
        } else {
            System.out.println("PetrolEngine problem, journey not started...");
        }
    }
}
