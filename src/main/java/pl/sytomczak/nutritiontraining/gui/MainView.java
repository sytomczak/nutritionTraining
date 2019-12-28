package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel resultTdeeJPanel;
    private JLabel bmiJLabel;
    private JTextField bmiTextField;

    private DailyDemandCalculation dailyDemandCalculation;

    public MainView() {
        initializeDailyDemandCalculation();

        setContentPane(mainPanel);
        setModal(true);
        getRootPane().setDefaultButton(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCalculate();
            }
        });

        physiqueComboBox.addActionListener(e -> onSelectPhysique());
        dailyActivityComboBox.addActionListener(e -> onSelectDailyActivity());
        intensityOfAerobicWorkoutComboBox.addActionListener(e -> onSelectIntensityOfAerobicWorkout());
        intensityOfStrongWorkoutComboBox1.addActionListener(e -> onSelectIntensityOfStrongWorkout());
    }


    private void initializeDailyDemandCalculation() {
        dailyDemandCalculation = new DailyDemandCalculation();

    }

    private void onSelectIntensityOfStrongWorkout() {

    }

    private void onSelectIntensityOfAerobicWorkout() {

    }

    private void onSelectDailyActivity() {

    }

    private void onSelectPhysique() {
//        switch ((String) physiqueComboBox.getSelectedItem()) {
//            case
//        }
    }

    private void onCalculate() {
        setFieldValues();
    }

    private void setFieldValues() {
        if (isNumeric(this.ageTextField.getText()))
            dailyDemandCalculation.setAge(Integer.parseInt(this.ageTextField.getText())); // tak jak to sama linia
        else this.ageTextField.setText("Number only");
        System.out.println(dailyDemandCalculation.getAge());


    }

    private boolean isNumeric(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        MainView dialog = new MainView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
