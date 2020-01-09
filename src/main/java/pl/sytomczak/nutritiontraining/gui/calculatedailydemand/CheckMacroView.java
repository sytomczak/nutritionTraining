package pl.sytomczak.nutritiontraining.gui.calculatedailydemand;

import pl.sytomczak.nutritiontraining.dailydemand.calculatemacro.CalculateMacro;
import pl.sytomczak.nutritiontraining.dailydemand.calculatemacro.VariableCaloriesDependingOnWeightChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CheckMacroView extends JFrame {
    private JRadioButton gainWeightButton;
    private JRadioButton keepWeightButton;
    private JRadioButton loseWeightButton;
    private JPanel checkMacroPanel;
    private JTextField proteinTextField;
    private JTextField fatTextField;
    private JTextField carbsTextField;
    private JTextField kcalTextField;
    private JLabel proteinLabel;
    private JLabel fatLabel;
    private JLabel carbsLabel;
    private JLabel kcalLabel;
    private JButton calculateButton;

    private CalculateMacro calculateMacro;

    public CheckMacroView() {
        calculateMacro = new CalculateMacro();
        setContentPane(checkMacroPanel);
        setTitle("Macro");
        getRootPane().setDefaultButton(calculateButton);
        checkMacroPanel.setPreferredSize(new Dimension(600, 300));

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCalculate();
            }
        });

        checkMacroPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        gainWeightButton.addActionListener(e -> onSelectGainWeightButton());
        keepWeightButton.addActionListener(e -> onSelectKeepWeightButton());
        loseWeightButton.addActionListener(e -> onSelectLoseWeightButton());

    }


    private void onSelectLoseWeightButton() {
        calculateMacro.setCaloriesDependingOnWeightChange(VariableCaloriesDependingOnWeightChange.LOSE);
    }

    private void onSelectKeepWeightButton() {
        calculateMacro.setCaloriesDependingOnWeightChange(VariableCaloriesDependingOnWeightChange.KEEP);
    }

    private void onSelectGainWeightButton() {
        calculateMacro.setCaloriesDependingOnWeightChange(VariableCaloriesDependingOnWeightChange.GAIN);
    }

    private void onCalculate() {
        this.carbsTextField.setText(String.valueOf(calculateMacro.calculationMacro().getCarbs()));
        this.fatTextField.setText(String.valueOf(calculateMacro.calculationMacro().getFat()));
        this.proteinTextField.setText(String.valueOf(calculateMacro.calculationMacro().getProtein()));
        this.kcalTextField.setText(String.valueOf(calculateMacro.calculationMacro().getCalories()));
    }

    private void onCancel() {
        dispose();
    }

}
