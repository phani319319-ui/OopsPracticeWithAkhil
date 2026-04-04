public abstract class Vehicle {

    private String vehicleId;
    private String brand;
    private double pricePerDay;

    public Vehicle(String vehicleId, String brand, double pricePerDay){
        this.vehicleId= vehicleId;
        this.brand= brand;
        this.pricePerDay= pricePerDay;
    }

    public double getpricePerDay(){
         return pricePerDay;
    }

    // public void setBrand(String brand){

    //      this.brand=brand;
    // }


    public void getDetails(){
        System.out.println("vehile is "+ vehicleId+"  brand  :"+brand+" pricePerDay "+pricePerDay);
    }

    public double calculateRent(int days){
        return pricePerDay*days;
    }

}
