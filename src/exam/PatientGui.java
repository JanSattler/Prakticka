package exam;

import javax.swing.*;
import java.awt.*;

/**
 * GUI pro pridani mereni.
 */
public class PatientGui extends JFrame {
    private static final int DEFAULT_BPM = 98;

    public static void init() {
        new PatientGui().setVisible(true);
    }

    public PatientGui() {
        // TODO: vytvorit formular
        setLocationRelativeTo(null);
        setTitle("New measurement");
        setSize(400, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 10, 5));
        JLabel patientIdLabel = new JLabel("Patient ID: ");
        JTextField patientIdField = new JTextField();
        JLabel minuteLabel = new JLabel("Minute: ");
        JTextField minuteField = new JTextField();
        JLabel oxygenLabel = new JLabel("Oxygen: ");
        JTextField oxygenField = new JTextField();
        JLabel bloodPressureLabel = new JLabel("Blood pressure: ");

        JPanel bloodPressurePanel = new JPanel();
        bloodPressurePanel.setLayout(new FlowLayout());
        JTextField systolicField = new JTextField();
        JLabel slash = new JLabel("/");
        JTextField diastolicField = new JTextField();
        systolicField.setPreferredSize(new Dimension(50, 20));
        diastolicField.setPreferredSize(new Dimension(50, 20));
        bloodPressurePanel.add(systolicField);
        bloodPressurePanel.add(slash);
        bloodPressurePanel.add(diastolicField);

        JLabel blankLabel = new JLabel();
        JCheckBox patientIsConscious = new JCheckBox("Patient is Conscious");


        formPanel.add(patientIdLabel);
        formPanel.add(patientIdField);
        formPanel.add(minuteLabel);
        formPanel.add(minuteField);
        formPanel.add(oxygenLabel);
        formPanel.add(oxygenField);
        formPanel.add(bloodPressureLabel);
        formPanel.add(bloodPressurePanel);
        formPanel.add(blankLabel);
        formPanel.add(patientIsConscious);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            StringBuilder errors = new StringBuilder();
            if (patientIdField.getText().isEmpty()) {
                errors.append("- Patient ID field cannot be empty.\n");
            }
            if (minuteField.getText().isEmpty()) {
                errors.append()
            }

            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Following errors occurred:\n" + errors, "Errors", JOptionPane.ERROR_MESSAGE);
            } else {
                //new measurement
                //TicketHandle.supportTickets.add(st);
                JOptionPane.showMessageDialog(null, "Ok", "Info", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });

        add(formPanel, BorderLayout.NORTH);
        add(saveButton, BorderLayout.SOUTH);
    }
}
