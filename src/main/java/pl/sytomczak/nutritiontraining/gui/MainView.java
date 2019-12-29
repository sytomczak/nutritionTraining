package pl.sytomczak.nutritiontraining.gui;

import org.omg.CORBA.DATA_CONVERSION;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainView extends JDialog {

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
    private JButton bodyButton;

    private DailyDemandCalculation dailyDemandCalculation;

    public MainView() {
        dailyDemandCalculation = new DailyDemandCalculation();
        setContentPane(mainPanel);
        setModal(true);
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

        bodyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Atlas atlasDialog = new Atlas();
                atlasDialog.pack();
                atlasDialog.setVisible(true);

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

    public static void main(String[] args) {
        MainView dialog = new MainView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

    }
}
