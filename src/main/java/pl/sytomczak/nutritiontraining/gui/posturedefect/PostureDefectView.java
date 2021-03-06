package pl.sytomczak.nutritiontraining.gui.posturedefect;

import pl.sytomczak.nutritiontraining.ApplicationProperties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Properties;

public class PostureDefectView extends JFrame {
    private JPanel postureJPanel;

    private JRadioButton scoliosisRadioButton;
    private JRadioButton kyphosisTreatmentRadioButton;
    private JRadioButton lordosisTreatmentRadioButton;
    private JLabel postureJLabel;
    private JButton buttonOK;

    private static final Properties PROPERTIES = ApplicationProperties.INSTANCE.getProperties();

    public PostureDefectView() {
        setContentPane(postureJPanel);
        setTitle("Posture Defect");
        postureJPanel.setPreferredSize(new Dimension(775, 560));
        postureJLabel.setIcon(new ImageIcon(getClass().getResource("/postawa.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getRootPane().setDefaultButton(buttonOK);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        postureJPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        kyphosisTreatmentRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runPostureDefectTreatmentView(PROPERTIES.getProperty("posture.defect.kyphosis.treatment"));
            }
        });

        lordosisTreatmentRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runPostureDefectTreatmentView(PROPERTIES.getProperty("posture.defect.lordosis.treatment"));
            }
        });

        scoliosisRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runPostureDefectTreatmentView(PROPERTIES.getProperty("posture.defect.scolsiosis.treatment"));
            }
        });
    }

    private void onCancel() {
        dispose();
    }

    private void runPostureDefectTreatmentView(String treatment) {
        PostureDefectTreatmentView postureDefectTreatmentView = PostureDefectTreatmentView.getInstanceFor(treatment);
        postureDefectTreatmentView.pack();
        postureDefectTreatmentView.setVisible(true);
        postureDefectTreatmentView.setResizable(false);
        postureDefectTreatmentView.setLocationRelativeTo(null);
    }
}
