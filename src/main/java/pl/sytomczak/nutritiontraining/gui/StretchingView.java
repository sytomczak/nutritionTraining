package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.*;

public class StretchingView extends JDialog {
    private JPanel contentPane;
    private JLabel photoLabel;
    private JEditorPane stretchPanel;
    private JRadioButton fullBodyStretchingButton;
    private JRadioButton stretchingIndividualMuscleButton;
    private JButton buttonOK;
    private JButton buttonCancel;

    public StretchingView() {
        setContentPane(contentPane);
        setTitle("Stretching");
        contentPane.setPreferredSize(new Dimension(1300, 550));
        photoLabel.setIcon(new ImageIcon(getClass().getResource("/stre.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
