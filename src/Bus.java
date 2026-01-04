public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity){
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee(){
        return (getBasePrice() * 0.10) * passengerCapacity;
    }
    @Override
    public String toString(){
        return super.toString() + ", Type: Bus, Capacity: " + passengerCapacity;
    }
    @Override
    public void performService(){
        System.out.println("Servicing bus" + getModel() + "checking firstAid kit");
    }
    @Override
    public int getServiceIntervalKm(){
        return 20000;
    }
}
