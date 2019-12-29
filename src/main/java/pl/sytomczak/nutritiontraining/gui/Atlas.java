package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atlas extends JDialog {
    private JButton closeButton;
    private JPanel bodyJPanel;
    private JLabel photo1jLabel;

    public Atlas() {

        photo1jLabel.setIcon((new ImageIcon((getClass().getResource("/tyl.jpg"))))); //dziala!!!!!!!!!
        setContentPane(bodyJPanel);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
