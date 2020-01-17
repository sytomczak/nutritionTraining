package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.stretching.BicepsFemorisAreasButton;
import pl.sytomczak.nutritiontraining.stretching.FullBodyStretching;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StretchingView extends JDialog {
    private JPanel contentPane;
    private JLabel photoLabel;
    private JEditorPane stretchPanel;
    private JButton fullBodyButton;
    private JButton buttonCancel;

    private FullBodyStretching fullBodyStretching;
    private BicepsFemorisAreasButton bicepsFemorisAreas;


    public StretchingView() {
        setContentPane(contentPane);
        setTitle("Stretching");
        contentPane.setPreferredSize(new Dimension(1300, 550));
        photoLabel.setIcon(new ImageIcon(getClass().getResource("/stre.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        stretchingButtons();
        fullBodyButton.addActionListener(e -> onSelectFullBodyButton());
    }

    private void onSelectFullBodyButton() {
        fullBodyStretching = new FullBodyStretching();
        stretchPanel.setText(fullBodyStretching.getStretching());
    }


    private void stretchingButtons() {
        JButton bicepsFemorisAreasButton = new JButton();
        photoLabel.setLayout(null);
        bicepsFemorisAreasButton.setBackground(Color.RED);
        bicepsFemorisAreasButton.setBounds(100, 100, 50, 50);
        photoLabel.add(bicepsFemorisAreasButton);

        bicepsFemorisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bicepsFemorisAreas = new BicepsFemorisAreasButton();
                stretchPanel.setText(bicepsFemorisAreas.getStretching());
            }
        });


    }

}
