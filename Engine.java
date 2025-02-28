public class Engine implements EngineRequirements{
    //Attributes
    private FuelType fuel;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructor for Engine
     * @param fuel Engine's fuel type
     * @param currentFuelLevel currentFuelLevel Engine's current fuel level
     * @param maxFueLevel maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.fuel = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public FuelType getFuelType() {
        return this.fuel;
    }

    public double getMaxFuel(){
        return maxFuelLevel;
    }

    public double getCurrentFuel(){
        return currentFuelLevel;
    }

    public void refuel(){
        currentFuelLevel = maxFuelLevel;

    }

    public Boolean go(){
        if (currentFuelLevel > 0){
            currentFuelLevel -= 1;
            return true;
        }
        return false;
    } 

    public String toString() {
        return ("Engine has fuel type: " + this.fuel + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel); 
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.); 
        System.out.println(myEngine);

        Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        System.out.println(myOtherEngine);
    }



}