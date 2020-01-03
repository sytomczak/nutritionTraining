package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMaximus;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMaximusExternalBottomAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMedius;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMinimus;

import javax.swing.*;
import java.awt.event.*;

public class Atlas extends JDialog {
    private JButton closeButton;
    private JPanel bodyJPanel;
    private JLabel photo1jLabel;

    private GluteusMaximus gluteusMaximus;
    private GluteusMedius gluteusMedius;
    private GluteusMaximusExternalBottomAreas gluteusMaximusExternalBottomAreas;
    private GluteusMinimus gluteusMinimus;


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

        JButton gluteusMediusButton = new JButton();
        photo1jLabel.setLayout(null);
        gluteusMediusButton.setBounds(140, 260, 10, 10);
        photo1jLabel.add(gluteusMediusButton);

        JButton gluteusMaximusButton = new JButton();
        photo1jLabel.setLayout(null);
        gluteusMaximusButton.setBounds(190, 300, 10, 10);
        photo1jLabel.add(gluteusMaximusButton);

        JButton gluteusMaximusExternalBottomAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        gluteusMaximusExternalBottomAreasButton.setBounds(140, 300, 10, 10);
        photo1jLabel.add(gluteusMaximusExternalBottomAreasButton);

        JButton gluteusMinimusButton = new JButton();
        photo1jLabel.setLayout(null);
        gluteusMinimusButton.setBounds(210, 270, 10, 10);
        photo1jLabel.add(gluteusMinimusButton);


//        ----------------------

        gluteusMaximusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMaximus = new GluteusMaximus();
                System.out.println(gluteusMaximus.getExercises());
            }
        });

        gluteusMediusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMedius = new GluteusMedius();
                System.out.println(gluteusMedius.getExercises());
            }
        });

        gluteusMaximusExternalBottomAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMaximusExternalBottomAreas = new GluteusMaximusExternalBottomAreas();
                System.out.println(gluteusMaximusExternalBottomAreas.getExercises());
            }
        });

        gluteusMinimusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMinimus = new GluteusMinimus();
                System.out.println(gluteusMinimus.getExercises());
            }
        });


        //
//        JPanel popupPanel = createPopupPanel(gluteusMaximusbButton);
//        popupPanel.setAlignmentX(100);
//        popupPanel.setAlignmentY(100);


        //    photo1jLabel.setLayout(new OverlayLayout(photo1jLabel));
        //  photo1jLabel.add(popupPanel);

        photo1jLabel.add(gluteusMaximusButton);
    }
//
//    private static JPanel createPopupPanel(JComponent overlapComponent) {
//        JPanel popupPanel = new JPanel(new BorderLayout());
//        popupPanel.setOpaque(false);
//        popupPanel.setMaximumSize(new Dimension(100, 100));
//        popupPanel.setBorder(new LineBorder(Color.gray));
//        popupPanel.setVisible(false);
//
//        JLabel label = new JLabel("HI there!");
//        popupPanel.add(wrapInPanel(label), BorderLayout.CENTER);
//
//        JButton popupCloseButton = new JButton("Close");
//        popupPanel.add(wrapInPanel(popupCloseButton), BorderLayout.SOUTH);
//
//        popupCloseButton.addActionListener(e -> {
//            overlapComponent.setEnabled(true);
//            popupPanel.setVisible(false);
//        });
//
//        return popupPanel;
//    }
//
//    private static JPanel wrapInPanel(JComponent component) {
//        JPanel jPanel = new JPanel();
//        jPanel.setBackground(new Color(50, 210, 250, 150));
//        jPanel.add(component);
//        return jPanel;
//    }
//
//
//    private static JFrame createFrame() {
//        JFrame frame = new JFrame("OverlayLayout Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(new Dimension(700, 700));
//        return frame;
//    }
//}
//
}