//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee;
        Doctor doctor1=new Doctor("DoctorEmergency","Phani","Doc-123","Surgeon");
        Nurse nurse1= new Nurse("NurseEmergency","Radha","N-456",5);
        Patient patient= new Patient("Krishna",doctor1,"p-789");
        patient.getDetailse();
        doctor1.clockInClockOut(10.00,15.15);
        nurse1.assistInWard();
        nurse1.getEmpName();
        doctor1.treatAPatient(patient);

    }
}