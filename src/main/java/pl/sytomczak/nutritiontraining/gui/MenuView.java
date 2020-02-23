package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.clock.Clock;
import pl.sytomczak.nutritiontraining.gui.calculatedailydemand.CalculateDailyDemandView;
import pl.sytomczak.nutritiontraining.gui.posturedefect.PostureDefectView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuView extends JFrame {
    private JPanel menuPanel;
    private JButton calculateDailyDemandButton;
    private JButton atlasButton;
    private JButton postureDefectButton;
    private JButton stretchingButton;
    private JEditorPane clockPanel;
    private JButton dailyChallengeButton;
    private JButton warm_upAndQuickTrainingButton;

    public MenuView() {
        setContentPane(menuPanel);
        setTitle("Nutrition & Training");
        menuPanel.setPreferredSize(new Dimension(700, 400));
        getRootPane().setDefaultButton(calculateDailyDemandButton);

        menuPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        calculateDailyDemandButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculateDailyDemandView calculateDailyDemandViewButton = new CalculateDailyDemandView();
                calculateDailyDemandViewButton.pack();
                calculateDailyDemandViewButton.setVisible(true);
                calculateDailyDemandViewButton.setResizable(false);
                calculateDailyDemandViewButton.setLocationRelativeTo(null);
            }
        });

        postureDefectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PostureDefectView postureDefectView = new PostureDefectView();
                postureDefectView.pack();
                postureDefectView.setVisible(true);
                postureDefectView.setResizable(false);
                postureDefectView.setLocationRelativeTo(null);
            }
        });

        atlasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AtlasView atlasViewButton = new AtlasView();
                atlasViewButton.pack();
                atlasViewButton.setVisible(true);
                atlasViewButton.setResizable(false);
                atlasViewButton.setLocationRelativeTo(null);


            }
        });

        stretchingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StretchingRollingView stretchingView = new StretchingRollingView();
                stretchingView.pack();
                stretchingView.setResizable(false);
                stretchingView.setVisible(true);
                stretchingView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                stretchingView.setLocationRelativeTo(null);
            }
        });

        dailyChallengeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DailyChallengeView dailyChallengeView = new DailyChallengeView();
                dailyChallengeView.pack();
                dailyChallengeView.setResizable(false);
                dailyChallengeView.setVisible(true);
                dailyChallengeView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                dailyChallengeView.setLocationRelativeTo(null);
            }
        });

        warm_upAndQuickTrainingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WarmupAndQuickTrainingView warmupAndQuickTrainingView = new WarmupAndQuickTrainingView();
                warmupAndQuickTrainingView.pack();
                warmupAndQuickTrainingView.setResizable(false);
                warmupAndQuickTrainingView.setVisible(true);
                warmupAndQuickTrainingView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                warmupAndQuickTrainingView.setLocationRelativeTo(null);
            }
        });

        Clock.runClock(clockPanel);
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        menuView.pack();
        menuView.setResizable(false);
        menuView.setVisible(true);
        menuView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        menuView.setLocationRelativeTo(null);
    }
}
