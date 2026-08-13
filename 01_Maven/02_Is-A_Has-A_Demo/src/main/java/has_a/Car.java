package has_a;

// Creating the object and calling the method is called Has-A relationship.
// Object having another object inside it is called as Has-A relationship.
// Here also Car class is tightly coupled with PetrolEngine class.
// If somebody changes PetrolEngine class then Car class will get issues.
public class Car {

    public void drive(){

        Engine engine = new Engine();
        boolean status = engine.start();

        if (status){
            System.out.println("Journey started...");
        } else {
            System.out.println("PetrolEngine problem, journey not started...");
        }
    }
}
