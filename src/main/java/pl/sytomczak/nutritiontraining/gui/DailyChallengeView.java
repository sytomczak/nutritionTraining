package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.dailychallenge.DailyChallenge;

import javax.swing.*;
import java.awt.event.*;

public class DailyChallengeView extends JFrame {
    private JPanel contentPane;
    private JButton checkButton;
    private JEditorPane dailyChallengeEditorPane;
    private DailyChallenge dailyChallenge;

    public DailyChallengeView() {
        dailyChallenge =  new DailyChallenge();
        setContentPane(contentPane);
        setTitle("Daily Challenge");
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                check();
            }
        });

        dailyChallengeEditorPane.setText("Click the button!");
    }

    private void check() {
        dailyChallengeEditorPane.setText(dailyChallenge.getRandomChallenge());
    }

}
