package pl.sytomczak.nutritiontraining.gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
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
        photo1jLabel.setLayout(new OverlayLayout(photo1jLabel));

        JButton button = new JButton("Show Message");
        button.setAlignmentX(-1000);
        button.setAlignmentY(-1000);

        JPanel popupPanel = createPopupPanel(button);
        popupPanel.setAlignmentX(100);
        popupPanel.setAlignmentY(100);

        button.addActionListener(e -> {
            button.setEnabled(false);
            popupPanel.setVisible(true);
        });

        photo1jLabel.add(popupPanel);

        photo1jLabel.add(button);
    }

    private static JPanel createPopupPanel(JComponent overlapComponent) {
        JPanel popupPanel = new JPanel(new BorderLayout());
        popupPanel.setOpaque(false);
        popupPanel.setMaximumSize(new Dimension(300, 300));
        popupPanel.setBorder(new LineBorder(Color.gray));
        popupPanel.setVisible(false);

        JLabel label = new JLabel("HI there!");
        popupPanel.add(wrapInPanel(label), BorderLayout.CENTER);

        JButton popupCloseButton = new JButton("Close");
        popupPanel.add(wrapInPanel(popupCloseButton), BorderLayout.SOUTH);

        popupCloseButton.addActionListener(e -> {
            overlapComponent.setEnabled(true);
            popupPanel.setVisible(false);
        });

        return popupPanel;
    }

    private static JPanel wrapInPanel(JComponent component) {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(50, 210, 250, 150));
        jPanel.add(component);
        return jPanel;
    }


    private static JFrame createFrame() {
        JFrame frame = new JFrame("OverlayLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700, 700));
        return frame;
    }
}

