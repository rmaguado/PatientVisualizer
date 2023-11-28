package Patient;

import Patient.Patient;

import java.util.ArrayList;

public class PatientBook {
    private ArrayList<Patient> Patient_List;
    public PatientBook() {
        Patient_List = new ArrayList<Patient>();
    }
    public void Add_Patient(Patient patient) {
        Patient_List.add(patient);
    }
    public Patient Get_Patient_By_Name(String name) {
        ArrayList<Patient> matches = new ArrayList<Patient>();
        for (Patient patient : Patient_List) {
            if (patient.Get_Name() == name) matches.add(patient);
        }
        return matches.get(0);
    }
    public int Get_Total_Patients() {
        int count = 0;
        for (Patient patient : Patient_List) {
            count++;
        }
        return count;
    }

    public ArrayList<Patient> Get_Patient_List() {
        return Patient_List;
    }
}
