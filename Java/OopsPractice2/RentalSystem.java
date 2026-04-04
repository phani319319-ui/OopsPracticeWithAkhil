public class RentalSystem {

    public static void main(String[] args) {
       
        Vehicle c= new Car("C-132","Hyundai",1200.50,"HatchBack");
    
        c.getDetails();
        System.out.println(c.calculateRent(2));
        
        Bike b= new Bike("123","Pulasr",600,true );
        b.getDetails();
        System.out.println(b.calculateRent(2));

    }

}
