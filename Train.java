import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private final ArrayList<Car> cars;

    public Train(FuelType fuelType, double maxFuelLevel, double currentFuelLevel, int numberCars, int passengerCapacity){
        this.engine = new Engine(fuelType, maxFuelLevel, currentFuelLevel);
        this.cars = new ArrayList<>();

        for (int i = 0; i < numberCars; i++){
            cars.add(new Car(passengerCapacity));
        }

    }

    public Engine getENgine(){
        return engine;
    }

    public Car getCar(int i){
        if (i >= 0 && i < cars.size()){
            return cars.get(1);
        }
        return null;
    }

    public int getMaxCapacity(){
        int totalCapacity = 0;
        for (Car c: cars){
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    public int seatsRemaining(){
        int remainingSeats = 0;
        for (Car c: cars){
            remainingSeats += c.seatsRemaining();
        }
        return remainingSeats;
    }

    public void printManifest(){
        for (Car c: cars){
            c.printManifest();
        }
    }
}
