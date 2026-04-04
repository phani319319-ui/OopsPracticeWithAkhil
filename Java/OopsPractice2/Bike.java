public class Bike extends Vehicle {

    private boolean hasFuelIncluded;

      public Bike(String vehicleId, String brand, double pricePerDay, boolean hasFuelIncluded ){
        super(vehicleId, brand, pricePerDay);
        this.hasFuelIncluded= hasFuelIncluded;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Fuel status "+ hasFuelIncluded);
    }

    @Override
    public double calculateRent(int days){
        if(hasFuelIncluded){
             return getpricePerDay()*days+50*days;
        }
        else{
            return getpricePerDay()*days;
        }

    }


}
