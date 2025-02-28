public class Engine implements EngineRequirements{
    //Attributes
    private final FuelType fuel;
    private double currentFuelLevel;
    private final double maxFuelLevel;

    /**
     * Constructor for Engine
     * @param fuel Engine's fuel type
     * @param currentFuelLevel currentFuelLevel Engine's current fuel level
     * @param maxFueLevel maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType fuel, double currentFuelLevel, double maxFuelLevel){
        this.fuel = fuel;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    @Override
    public FuelType getFuelType() {
        return this.fuel;
    }

    @Override
    public double getMaxFuel(){
        return maxFuelLevel;
    }

    @Override
    public double getCurrentFuel(){
        return currentFuelLevel;
    }

    @Override
    public void refuel(){
        currentFuelLevel = maxFuelLevel;

    }

    @Override
    public Boolean go(){
        if (currentFuelLevel > 0){
            currentFuelLevel -= 1;
            return true;
        }
        return false;
    } 

    @Override
    public String toString() {
        return ("Engine has fuel type: " + this.fuel + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel); 
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 80., 100.); 
        System.out.println(myEngine);

        Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        System.out.println(myOtherEngine);

        Train myTrain = new Train(FuelType.ELECTRIC, 100, 50, 3, 5);
        System.err.println("Train's Engine: " + myTrain.getENgine());
        myTrain.printManifest();
    }

}