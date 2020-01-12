package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PostureDefectView extends JDialog {
    private JPanel postureJPanel;
    private JRadioButton scoliosisRadioButton;
    private JRadioButton kyphosisTreatmentRadioButton;
    private JRadioButton lordosisTreatmentRadioButton;
    private JLabel postureJLabel;
    private JButton buttonOK;
    private JButton buttonCancel;

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
    }

    private void onCancel() {
        dispose();
    }
}
