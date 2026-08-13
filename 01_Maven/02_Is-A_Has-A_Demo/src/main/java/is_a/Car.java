package is_a;

// Here we are doing inheritance.
// Car class is tightly coupled with PetrolEngine class.
// so Car class can not extend any other class in future
// as java does not support multiple inheritance.
// to overcome this issue we go for Has-A relationship. Refer demo in has_a package.
public class Car extends Engine {

    public void drive(){

        boolean status = super.start();

        if (status){
            System.out.println("Journey started...");
        } else {
            System.out.println("PetrolEngine problem, journey not started...");
        }
    }
}
