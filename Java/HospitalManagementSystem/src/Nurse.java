public class Nurse extends Employee{
    private int wardNo;

    public Nurse(String dept, String empName, String empId, int wardNo) {
        super(dept, empName, empId);
        this.wardNo = wardNo;
    }

    public void assistInWard(){
        System.out.println("Nurse doing work in ward "+wardNo+"  "+getEmpName());
    }
}
