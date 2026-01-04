public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors){
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;

    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee(){
        int age = getAge(2026);
        return (getBasePrice() * 0.10) + (age * 100);
    }
    @Override
    public String toString(){
        return super.toString() + ", Type: Car, Doors: " + numberOfDoors;
    }
    @Override
    public void performService(){
        System.out.println("Servicing Car " + getModel() + ": Doing some service shit with yo car.");
    }
    @Override
    public int getServiceIntervalKm(){
        return 99999999;
    }
}
