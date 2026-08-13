package dependency_injection;

public class PetrolEngine implements EngineInterface {

    PetrolEngine(){
        System.out.println("Petrol engine object created...");
    }

    public boolean start(){

        System.out.println("Started the petrol engine using start()...");
        return true;
    }
}
