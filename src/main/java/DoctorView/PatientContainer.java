package DoctorView;
import Patient.*;
import PatientTests.BP_Measurement;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PatientContainer {
    private Patient patient;
    private JPanel patientPanel;
    private JLabel label;
    private URL imageURL;

    public PatientContainer(Patient patient) {
        this.patient = patient;
        label = new JLabel();
        imageURL = null;
        try {
            imageURL = new URL(patient.Get_Photo_URL());
        }
        catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);

        int count_tests = patient.Get_Total_Tests();
        int total_rows = count_tests + 1;

        //create panel
        patientPanel = new JPanel();
        patientPanel.setSize(500, 200);
        patientPanel.setLayout(new GridLayout(3,2));

        patientPanel.add(label);

        JScrollPane scrollBar = new JScrollPane(patientPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
        scrollBar.add(patientPanel);

    }


    public Component Get_JPanel() {
        return patientPanel;
    }
}
