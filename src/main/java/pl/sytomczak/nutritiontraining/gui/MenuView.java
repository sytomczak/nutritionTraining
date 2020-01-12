package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.gui.calculatedailydemand.CalculateDailyDemandView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuView extends JDialog {
    private JPanel menuPanel;
    private JButton calculateDailyDemandButton;
    private JButton atlasButton;
    private JButton postureDefectButton;
    private JButton stretchingButton;

    public MenuView() {
        setContentPane(menuPanel);
        setTitle("Nutrition & Training");
        menuPanel.setPreferredSize(new Dimension(500, 300));
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
