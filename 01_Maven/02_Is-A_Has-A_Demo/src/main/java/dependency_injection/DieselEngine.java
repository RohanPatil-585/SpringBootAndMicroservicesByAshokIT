package dependency_injection;

public class DieselEngine implements EngineInterface {

    DieselEngine(){
        System.out.println("Diesel engine object created...");
    }

    public boolean start(){

        System.out.println("Started the diesel engine using start()...");
        return true;
    }
}
