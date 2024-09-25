package Vehical;

public abstract class AbstractVeh implements vehicle {
    @Override
    public void start(){
        System.out.println("Veh is Starting");
        
    }

    
    @Override
    public void stop(){
        System.out.println("Veh is stopping ");
    }
}
