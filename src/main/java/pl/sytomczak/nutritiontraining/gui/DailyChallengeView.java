package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DailyChallengeView extends JFrame {
    private JPanel contentPane;
    private JButton checkButton;
    private JEditorPane dailyChallengeEditorPane;


    public DailyChallengeView() {
        setContentPane(contentPane);
        setTitle("Daily Challenge");
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }


    private void onOK() {

    }

}
