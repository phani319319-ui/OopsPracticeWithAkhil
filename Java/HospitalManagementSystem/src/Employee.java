public abstract class Employee implements Clockable {

    private static String  hospitalName="KIMS";
    private String empName;
    private String empId;
    private String Dept;


    public Employee(String dept, String empName, String empId) {
        Dept = dept;
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public void clockInClockOut(double timeIn, double timeOut) {
        System.out.println("employee entered in hospital "+ timeIn +" exites at "+timeOut+ " employee name "+this.empName+"  department "+getDept());


    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getDept() {
        return Dept;
    }


}
