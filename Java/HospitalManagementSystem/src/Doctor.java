public class Doctor extends Employee{
    private String specilization;


    public Doctor(String dept, String empName, String empId, String specilization) {
        super(dept, empName, empId);
        this.specilization = specilization;
    }

    public void treatAPatient(Patient patient){
        System.out.println("treatment done by doctor  "+ getEmpName()+" patient name is "+patient.getPatientName());
    }
}
