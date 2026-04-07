abstract public class Employee {

    private String companyName;
    private String empName;
    private String empId;
    private String department;

    public void getDetails(){
        System.out.println("Employee name  : "+empName+" Employee id : "+empId+" Department : "+department);
    }

    public abstract double calculateSalary(){

    }


}
