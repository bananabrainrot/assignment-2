public abstract class Vehicle implements Servicable{
    private int id;
    private static int idGen;
    private String model;
    private int year;
    private double basePrice;


    protected Vehicle(String model, int year, double basePrice){
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    public int getId(){
        return id;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        if (model != null && !model.isEmpty()){
            this.model = model;
        }
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        if (year > 1900){
            this.year = year;
        }
    }

    public double getBasePrice(){
        return basePrice;
    }

    public void setBasePrice(double basePrice){
        if (basePrice > 0){
            this.basePrice = basePrice;
        }
    }

    public int getAge(int currentYear) {
        return currentYear - this.year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString(){
        return "Vehicle [id=" + id + ", model=" + model + "year=" + year + "baseprice=" + basePrice + "]";
    }
}

