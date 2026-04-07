public class Patient {
    private String patientName;
    private String patientId;

    private Doctor doc;

    public Patient(String patientName, Doctor doc, String patientId) {
        this.patientName = patientName;
        this.doc = doc;
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void getDetailse(){
        System.out.println("Patient details are "+this.patientName+" treated by "+this.doc.getEmpName());
    }
}
