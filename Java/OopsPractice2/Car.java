public class Car extends Vehicle {

    private String carType;


    public Car(String vehicleId, String brand, double pricePerDay, String carType ){
        super(vehicleId, brand, pricePerDay);
        this.carType= carType;
    }

    public void say(){
        System.out.println("Hello");
    }
    
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Car type is "+carType);
    }

    @Override
    public double calculateRent(int days){
        return getpricePerDay()*days+getpricePerDay()*0.10*days;
    }   


    
}
