package DoctorView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Patient.*;

public class DoctorInterface {

    private JFrame frame;
    private JPanel panel;

    private ArrayList<PatientContainer> Patient_Panel_List;

    private JScrollPane scroller;
    private PatientBook patient_book;

    private final int window_width = 500;
    private final int window_height = 500;
    private final int patient_panel_height = 200;

    public DoctorInterface() {
        Create_Patient_Panels();
        JFrame_Setup();
    }


    private void Create_Patient_Panels() {
        JPanel patient_panel = new JPanel();
        panel.setSize(window_width, patient_panel_height);

        for (Patient patient : patient_book.Get_Patient_List()) {

            Patient_Panel_List.add(new PatientContainer(patient));
        }
    }

    private void JFrame_Setup() {

        //initialize frame
        frame = new JFrame("Stroke Monitor");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int numpatients = 2;

        int count_patients = patient_book.Get_Total_Patients();
        JPanel Combined_Patients = new JPanel();
        Combined_Patients.setLayout(new GridLayout(count_patients,1));
        for (PatientContainer patientContainer : Patient_Panel_List) {
            Combined_Patients.add(patientContainer.Get_JPanel());
        }

        scroller = new JScrollPane(
                Combined_Patients,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
        scroller.add(Combined_Patients);

        //frame.add();
        frame.setVisible(true);

    }
}