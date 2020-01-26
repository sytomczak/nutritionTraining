package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarmupAndQuickTrainingView extends JFrame {
    private JPanel contentPane;
    private JEditorPane warmUpEditorPane1;
    private JEditorPane quickTrainingEditorPane;

    public WarmupAndQuickTrainingView() {
        setContentPane(contentPane);
        setTitle("Warm-up & Quick Training");
        contentPane.setPreferredSize(new Dimension(400, 400));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
}
