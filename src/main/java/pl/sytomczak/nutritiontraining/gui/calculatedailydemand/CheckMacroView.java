package pl.sytomczak.nutritiontraining.gui.calculatedailydemand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class CheckMacroView extends JDialog{
    private JRadioButton gainWeightButton;
    private JRadioButton keepWeightButton;
    private JRadioButton loseWeightButton;
    private JPanel checkMacroPanel;
    private JTextField proteinTextField;
    private JTextField fatTextField;
    private JTextField carbsTextField;
    private JTextField textField4;
    private JLabel proteinLabel;
    private JLabel fatLabel;
    private JLabel carbsLabel;
    private JLabel kcalLabel;

    public CheckMacroView() {
        setContentPane(checkMacroPanel);
        setTitle("Macro");
        checkMacroPanel.setPreferredSize(new Dimension(600,300));

        checkMacroPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }

    private void onCancel() {
        dispose();
    }

}
