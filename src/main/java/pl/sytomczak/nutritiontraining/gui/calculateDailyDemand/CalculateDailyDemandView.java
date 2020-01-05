package pl.sytomczak.nutritiontraining.gui.calculateDailyDemand;

import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;
import pl.sytomczak.nutritiontraining.dailydemand.Gender;
import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfAerobicWorkoutsLevel;
import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfStrongWorkoutsLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.DailyActivityLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.Physique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateDailyDemandView extends JFrame {

    private JPanel mainPanel;
    private JButton calculateButton;
    private JRadioButton manRadioButton;
    private JLabel genderJLabel;
    private JRadioButton womanRadioButton;
    private JLabel ageJLabel;
    private JTextField ageTextField;
    private JTextField heightTextField;
    private JLabel heightJLabel;
    private JLabel weightJLabel;
    private JTextField weightTextField;
    private JLabel physiqueJLabel;
    private JComboBox physiqueComboBox;
    private JLabel dailyActivityJLabel;
    private JComboBox dailyActivityComboBox;
    private JLabel numberOfStrongWorkoutsInWeekJLabel;
    private JTextField numberOfStrongWorkoutsInWeekTextField;
    private JLabel durationOfStrongWorkoutJLabel;
    private JTextField durationOfStrongWorkoutTextField;
    private JLabel intensityOfStrongWorkoutsJLabel;
    private JLabel numberOfAerobicWorkoutsInWeekJLabel;
    private JTextField numberOfAerobicWorkoutsInWeekTextField1;
    private JLabel durationOfAerobicWorkoutJLabel;
    private JTextField durationOfAerobicWorkoutTextField1;
    private JLabel intensityOfAerobicWorkoutJLabel;
    private JComboBox intensityOfAerobicWorkoutComboBox;
    private JComboBox intensityOfStrongWorkoutComboBox1;
    private JTextField dailyDemandTextField1;
    private JLabel resultTdeejLabell;
    private JLabel bmiJLabel;
    private JTextField bmiTextField;
    private JButton checkMacroButton;
    private JPanel checkMacroPanel;

    private DailyDemandCalculation dailyDemandCalculation;

    public CalculateDailyDemandView() {
        dailyDemandCalculation = new DailyDemandCalculation();
        setContentPane(mainPanel);
        mainPanel.setPreferredSize(new Dimension(450,500));
        setTitle("Calculate Daily Demand");
        getRootPane().setDefaultButton(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCalculate();
            }
        });

        womanRadioButton.addActionListener(e -> onSelectWomanRadioButton());
        manRadioButton.addActionListener(e -> onSelectManRadioButton());
        physiqueComboBox.addActionListener(e -> onSelectPhysique());
        dailyActivityComboBox.addActionListener(e -> onSelectDailyActivity());
        intensityOfAerobicWorkoutComboBox.addActionListener(e -> onSelectIntensityOfAerobicWorkout());
        intensityOfStrongWorkoutComboBox1.addActionListener(e -> onSelectIntensityOfStrongWorkout());

        checkMacroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckMacroView checkMacroViewButton = new CheckMacroView();
                checkMacroViewButton.pack();
                checkMacroViewButton.setVisible(true);
                checkMacroViewButton.setResizable(false);
                checkMacroViewButton.setLocationRelativeTo(null);
            }
        });

    }

    private void onSelectManRadioButton() {
        dailyDemandCalculation.setGender(Gender.MALE);
    }

    private void onSelectWomanRadioButton() {
        dailyDemandCalculation.setGender(Gender.FEMALE);
    }


    private void onSelectIntensityOfStrongWorkout() {
        switch ((String) intensityOfStrongWorkoutComboBox1.getSelectedItem()) {
            case "Low":
                dailyDemandCalculation.setIntensityOfStrongWorkoutsLevel(IntensityOfStrongWorkoutsLevel.LOW);
                break;
            case "Medium":
                dailyDemandCalculation.setIntensityOfStrongWorkoutsLevel(IntensityOfStrongWorkoutsLevel.MEDIUM);
                break;
            case "High":
                dailyDemandCalculation.setIntensityOfStrongWorkoutsLevel(IntensityOfStrongWorkoutsLevel.HIGH);
                break;
            default:
                break;
        }

    }

    private void onSelectIntensityOfAerobicWorkout() {
        switch ((String) intensityOfAerobicWorkoutComboBox.getSelectedItem()) {
            case "Low":
                dailyDemandCalculation.setIntensityOfAerobicWorkoutsLevel(IntensityOfAerobicWorkoutsLevel.LOW);
                break;
            case "Medium":
                dailyDemandCalculation.setIntensityOfAerobicWorkoutsLevel(IntensityOfAerobicWorkoutsLevel.MEDIUM);
                break;
            case "High":
                dailyDemandCalculation.setIntensityOfAerobicWorkoutsLevel(IntensityOfAerobicWorkoutsLevel.HIGH);
                break;
            default:
                break;
        }

    }

    private void onSelectDailyActivity() {
        switch ((String) dailyActivityComboBox.getSelectedItem()) {
            case "Low":
                dailyDemandCalculation.setSelectedDailyActivity(DailyActivityLevel.LOW);
                break;
            case "Medium":
                dailyDemandCalculation.setSelectedDailyActivity(DailyActivityLevel.MEDIUM);
                break;
            case "High":
                dailyDemandCalculation.setSelectedDailyActivity(DailyActivityLevel.HIGH);
                break;
            default:
                break;
        }
    }

    private void onSelectPhysique() {
        switch ((String) physiqueComboBox.getSelectedItem()) {
            case "Endomorph":
                dailyDemandCalculation.setPhysique(Physique.ENDOMORPH);
                break;
            case "Mesomorpg":
                dailyDemandCalculation.setPhysique(Physique.MESOMORPH);
                break;
            case "Ectomorph":
                dailyDemandCalculation.setPhysique(Physique.ECTOMORPH);
                break;
            default:
                break;
        }
    }

    private void onCalculate() {
        setFieldValues();
        this.dailyDemandTextField1.setText(String.valueOf(dailyDemandCalculation.calculateDailyDemand().getDemandInKcal()));
        this.bmiTextField.setText(String.valueOf(dailyDemandCalculation.calculateDailyDemand().getBmi()));
    }


    private void setFieldValues() {
        try {
            dailyDemandCalculation.setAge(Integer.parseInt(this.ageTextField.getText()));
            dailyDemandCalculation.setWeight(Integer.parseInt(this.weightTextField.getText()));
            dailyDemandCalculation.setHeight(Integer.parseInt(this.heightTextField.getText()));
            dailyDemandCalculation.setNumberOfStrongWorkoutsInWeek(Integer.parseInt(this.numberOfStrongWorkoutsInWeekTextField.getText()));
            dailyDemandCalculation.setDurationOfOneStrongWorkout(Integer.parseInt(this.durationOfStrongWorkoutTextField.getText()));
            dailyDemandCalculation.setNumberOfAerobicWorkoutsInWeek(Integer.parseInt(this.numberOfAerobicWorkoutsInWeekTextField1.getText()));
            dailyDemandCalculation.setDurationOfOneAerobicWorkout(Integer.parseInt(this.durationOfAerobicWorkoutTextField1.getText()));
        } catch (Exception z) {
            JOptionPane.showMessageDialog(this, "Number only", "Inane error", JOptionPane.ERROR_MESSAGE);
            dailyDemandCalculation.setAge(Integer.parseInt(this.ageTextField.getText()));
            dailyDemandCalculation.setWeight(Integer.parseInt(this.weightTextField.getText()));
            dailyDemandCalculation.setHeight(Integer.parseInt(this.heightTextField.getText()));
            dailyDemandCalculation.setNumberOfStrongWorkoutsInWeek(Integer.parseInt(this.numberOfStrongWorkoutsInWeekTextField.getText()));
            dailyDemandCalculation.setDurationOfOneStrongWorkout(Integer.parseInt(this.durationOfStrongWorkoutTextField.getText()));
            dailyDemandCalculation.setNumberOfAerobicWorkoutsInWeek(Integer.parseInt(this.numberOfAerobicWorkoutsInWeekTextField1.getText()));
            dailyDemandCalculation.setDurationOfOneAerobicWorkout(Integer.parseInt(this.durationOfAerobicWorkoutTextField1.getText()));
            return;
        }
    }
}
