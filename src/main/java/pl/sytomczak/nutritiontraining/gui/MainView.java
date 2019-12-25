package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;

public class MainView extends JDialog {

    private JPanel mainPanel;
    private JButton button1;

    public MainView() {
        setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        MainView dialog = new MainView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
