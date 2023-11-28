package PatientTests;

public class MRI_Scan {
    private String URL_To_Image;
    private String Date_Of_Examination;
    private int Magnetic_Field_Strength_tesla;

    public void Set_URL_To_Image(String url) {
        URL_To_Image = url;
    }
    public String Get_URL_To_Image() {
        if (URL_To_Image != null) return URL_To_Image;
        return "URL Undefined";
    }
    public void Set_Date_Of_Examination(String date) {
        Date_Of_Examination = date;
    }
    public String Get_Date_Of_Examination() {
        if (Date_Of_Examination != null) return Date_Of_Examination;
        return "Date Undefined";
    }
    public void Magnetic_Field_Strength_tesla(int strength) {
        Magnetic_Field_Strength_tesla = strength;
    }
    public int Magnetic_Field_Strength_tesla() {
        return Magnetic_Field_Strength_tesla;
    }

}
