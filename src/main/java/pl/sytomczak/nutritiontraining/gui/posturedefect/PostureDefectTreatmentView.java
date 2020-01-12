package pl.sytomczak.nutritiontraining.gui.posturedefect;

import jdk.nashorn.internal.scripts.JD;
import pl.sytomczak.nutritiontraining.gui.posturedefect.PostureDefectView;
import pl.sytomczak.nutritiontraining.posturedefect.Kyphosis;
import pl.sytomczak.nutritiontraining.posturedefect.Lordosis;
import pl.sytomczak.nutritiontraining.posturedefect.Scoliosis;

import javax.swing.*;
import java.awt.*;

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

        //jak rozdzielic zeby guziki z innego forma laplapy, ze  wtym formie ma wyswietlac sie info z akurat tego forma
        kyphosis = new Kyphosis();
        treatmentEditorPane.setText(kyphosis.getTreatments());

        lordosis = new Lordosis();
        treatmentEditorPane.setText(lordosis.getTreatments());

        scoliosis = new Scoliosis();
        treatmentEditorPane.setText(scoliosis.getTreatments());

    }




}

