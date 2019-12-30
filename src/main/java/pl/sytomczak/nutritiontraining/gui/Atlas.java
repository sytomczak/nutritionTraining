package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atlas extends JDialog {
    private JButton closeButton;
    private JPanel bodyJPanel;
    private JLabel photo1jLabel;

    public Atlas() {

        setContentPane(bodyJPanel);
        photo1jLabel.setIcon((new ImageIcon((getClass().getResource("/body.jpg")))));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
};
