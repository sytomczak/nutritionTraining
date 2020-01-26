package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.event.*;

public class DailyChallengeView extends JFrame {
    private JPanel contentPane;
    private JButton checkButton;
    private JEditorPane dailyChallengeEditorPane;


    public DailyChallengeView() {
        setContentPane(contentPane);
        getRootPane().setDefaultButton(checkButton);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }


    private void onOK() {
        dispose();
    }
}
