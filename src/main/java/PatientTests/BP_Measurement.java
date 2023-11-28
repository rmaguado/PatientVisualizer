package PatientTests;

public class BP_Measurement {
    private double Systolic_Pressure;
    private double Diastolic_Pressure;
    private String Date_Of_Examination;
    private String Duration;

    public void Set_Pressure(double diastolic, double systolic) {
        Diastolic_Pressure = diastolic;
        Systolic_Pressure = systolic;
    }
    public double Get_Diastolic_Pressure() {
        return Diastolic_Pressure;
    }
    public double Get_Systolic_Pressure() {
        return Systolic_Pressure;
    }
    public void Set_Date_Of_Examination(String date) {
        Date_Of_Examination = date;
    }
    public String Get_Date_Of_Examination() {
        if (Date_Of_Examination != null) return Date_Of_Examination;
        return "";
    }
    public void Set_Duration(String duration) {
        Duration = duration;
    }
    public String Get_Duration() {
        if (Duration != null) return Duration;
        return "";
    }


}
