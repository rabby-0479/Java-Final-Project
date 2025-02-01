
abstract class TrafficSignal {
    protected String location;
    protected String currentSignal;
    
    public TrafficSignal(String location, String currentSignal) {
        this.location = location;
        this.currentSignal = currentSignal;
    }
    
    public abstract void changeSignal(String newSignal);
    
    public void displaySignal() {
        System.out.println("Location: " + location + " | Current Signal: " + currentSignal);
    }
}


class PedestrianSignal extends TrafficSignal {
    public PedestrianSignal(String location, String currentSignal) {
        super(location, currentSignal);
    }
    
    @Override
    public void changeSignal(String newSignal) {
        currentSignal = newSignal;
        System.out.println("Pedestrian signal changed to: " + newSignal);
    }
}

class VehicleSignal extends TrafficSignal {
    public VehicleSignal(String location, String currentSignal) {
        super(location, currentSignal);
    }
    
    @Override
    public void changeSignal(String newSignal) {
        currentSignal = newSignal;
        System.out.println("Vehicle signal changed to: " + newSignal);
    }
}


class EmergencySignal extends TrafficSignal {
    public EmergencySignal(String location, String currentSignal) {
        super(location, currentSignal);
    }
    
    @Override
    public void changeSignal(String newSignal) {
        currentSignal = newSignal;
        System.out.println("Emergency signal changed to: " + newSignal);
    }
}

public class TrafficManagementSystem {
    public static void main(String[] args) {
        PedestrianSignal pedestrian = new PedestrianSignal("Crosswalk Rabby", "Red");
        VehicleSignal vehicle = new VehicleSignal("Intersection Sagor", "Green");
        EmergencySignal emergency = new EmergencySignal("Highway Prohor", "Yellow");
        
        pedestrian.displaySignal();
        pedestrian.changeSignal("Green");
        pedestrian.displaySignal();
        
        vehicle.displaySignal();
        vehicle.changeSignal("Red");
        vehicle.displaySignal();
        
        emergency.displaySignal();
        emergency.changeSignal("Flashing Red");
        emergency.displaySignal();
    }
}
