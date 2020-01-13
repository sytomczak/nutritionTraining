package pl.sytomczak.nutritiontraining.gui.posturedefect;

import pl.sytomczak.nutritiontraining.posturedefect.Kyphosis;
import pl.sytomczak.nutritiontraining.posturedefect.Lordosis;
import pl.sytomczak.nutritiontraining.posturedefect.Scoliosis;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class PostureDefectView extends JDialog {
    private JPanel postureJPanel;

    private JRadioButton scoliosisRadioButton;
    private JRadioButton kyphosisTreatmentRadioButton;
    private JRadioButton lordosisTreatmentRadioButton;
    private JLabel postureJLabel;
    private JEditorPane treatmentPane;
    private JButton buttonOK;

    private Kyphosis kyphosis;
    private Lordosis lordosis;
    private Scoliosis scoliosis;

    public PostureDefectView() {
        setContentPane(postureJPanel);
        setTitle("Posture Defect");
        postureJPanel.setPreferredSize(new Dimension(775, 800)); //560
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
                kyphosis = new Kyphosis();
                treatmentPane.setText(kyphosis.getTreatments());
            }
        });

        lordosisTreatmentRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lordosis = new Lordosis();
                treatmentPane.setText(lordosis.getTreatments());
            }
        });

        scoliosisRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoliosis = new Scoliosis();
                treatmentPane.setText(scoliosis.getTreatments());
            }
        });
    }
        private void onCancel () {
            dispose();
        }

//    private void runPostureDefectTreatmentView() {
//        PostureDefectTreatmentView postureDefectTreatmentView = new PostureDefectTreatmentView();
//        postureDefectTreatmentView.pack();
//        postureDefectTreatmentView.setVisible(true);
//        postureDefectTreatmentView.setResizable(false);
//        postureDefectTreatmentView.setLocationRelativeTo(null);
//
//    }
//
//    public JRadioButton getScoliosisRadioButton() {
//        return scoliosisRadioButton;
//    }

//    public JRadioButton getKyphosisTreatmentRadioButton() {
//        return kyphosisTreatmentRadioButton;
//    }

//    public JRadioButton getLordosisTreatmentRadioButton() {
//        return lordosisTreatmentRadioButton;
//    }

}
