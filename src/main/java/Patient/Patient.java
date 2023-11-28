package Patient;

import PatientTests.BP_Measurement;
import PatientTests.MRI_Scan;

import java.util.ArrayList;

public class Patient {
    private String Name;
    private int Age;
    private String Photo_Url;
    private ArrayList<MRI_Scan> MRI_Scans;
    private ArrayList<BP_Measurement> BP_Measurements;
    public Patient(String name) {
        Name = name;
        MRI_Scans = new ArrayList<MRI_Scan>();
        BP_Measurements = new ArrayList<BP_Measurement>();
    }
    public void Set_Age(int age) {
        Age = age;
    }
    public int Get_Age() {
        return Age;
    }
    public void Set_Name(String name) {
        Name = name;
    }
    public String Get_Name() {
        return Name;
    }
    public void Add_MRI_Scan(MRI_Scan scan) {
        MRI_Scans.add(scan);
    }
    public void Add_BP_Measurement(BP_Measurement measurement) {
        BP_Measurements.add(measurement);
    }
    public void Set_Photo_URL(String url) {
        Photo_Url = url;
    }
    public String Get_Photo_URL() {
        if (Photo_Url != null) return Photo_Url;
        return "";
    }
}
