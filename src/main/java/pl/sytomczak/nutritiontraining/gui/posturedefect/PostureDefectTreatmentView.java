package pl.sytomczak.nutritiontraining.gui.posturedefect;

import pl.sytomczak.nutritiontraining.posturedefect.Kyphosis;
import pl.sytomczak.nutritiontraining.posturedefect.Lordosis;
import pl.sytomczak.nutritiontraining.posturedefect.Scoliosis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PostureDefectTreatmentView extends JDialog {
    private JPanel treatmentPanel;
    private JEditorPane treatmentEditorPane;
    private JScrollPane treatmentListingScrollPanel;

    private Kyphosis kyphosis;
    private Lordosis lordosis;
    private Scoliosis scoliosis;

    public PostureDefectTreatmentView() {

        setContentPane(treatmentPanel);
        setTitle("Treatment");
        treatmentPanel.setPreferredSize(new Dimension(500, 300));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


//        PostureDefectView kyphosisTreatmentRadioButton = new PostureDefectView();
//        kyphosisTreatmentRadioButton.getKyphosisTreatmentRadioButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                kyphosis = new Kyphosis();
//                treatmentEditorPane.setText(kyphosis.getTreatments());
//
//            }
//        });
//
//
//        PostureDefectView lordosisTreatmentRadioButton = new PostureDefectView();
//        lordosisTreatmentRadioButton.getLordosisTreatmentRadioButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                lordosis = new Lordosis();
//                treatmentEditorPane.setText(lordosis.getTreatments());
//            }
//        });
//
//
//        PostureDefectView scoliosisTreatmentRadioButton = new PostureDefectView();
//        scoliosisTreatmentRadioButton.getScoliosisRadioButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                scoliosis = new Scoliosis();
//                treatmentEditorPane.setText(scoliosis.getTreatments());
//            }
//        });
    }
}

