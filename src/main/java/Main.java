import DoctorView.DoctorInterface;
import Patient.Patient;
import PatientTests.BP_Measurement;

public class Main {
    public static void main(String[] args){
        PatientBook patientBook = new PatientBook();

        Patient patientA = new Patient("Daphne Von Oram");
        patientA.Set_Age(62);
        patientA.Set_Photo_URL("");
        BP_Measurement measurementA = new BP_Measurement();
        measurementA.Set_Date_Of_Examination("14-10-2023");
        measurementA.Set_Pressure(130, 70);
        measurementA.Set_Duration("ST");
        patientA.Add_BP_Measurement(measurementA);

        Patient patientB = new Patient("Sebastian Compton");
        patientB.Set_Age(31);
        patientB.Set_Photo_URL("");
        BP_Measurement measurementB = new BP_Measurement();
        measurementB.Set_Date_Of_Examination("14-10-2023");
        measurementB.Set_Pressure(130, 70);
        measurementB.Set_Duration("VST");
        patientA.Add_BP_Measurement(measurementB);

        patientBook.Add_Patient(patientA);
        patientBook.Add_Patient(patientB);

        DoctorInterface doctorUI = new DoctorInterface();

    }
}
