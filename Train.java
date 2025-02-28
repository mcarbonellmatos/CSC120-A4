public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int numberCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();


        for (int i = 0; i <numberCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }

    }

}
