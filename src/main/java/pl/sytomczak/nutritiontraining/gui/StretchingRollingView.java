package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.ApplicationProperties;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class StretchingRollingView extends JFrame {
    private JPanel contentPane;
    private JLabel photoLabel;
    private JEditorPane stretchPanel;
    private JButton fullBodyButton;
    private JScrollPane stretchingScrollPane;

    private static final Properties PROPERTIES = ApplicationProperties.INSTANCE.getProperties();

    public StretchingRollingView() {
        setContentPane(contentPane);
        setTitle("Stretching & Rolling");
        contentPane.setPreferredSize(new Dimension(1100, 550));
        photoLabel.setIcon(new ImageIcon(getClass().getResource("/stre.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        individualStretchingRollingMusclesButtons();
        fullBodyButton.addActionListener(e -> onSelectFullBodyButton());
    }

    public JEditorPane getStretchPanel() {
        return stretchPanel;
    }

    private void onSelectFullBodyButton() {
        StringBuilder contentBuilder = new StringBuilder();
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.5.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.10.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.15.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.20.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.25.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.30.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.35.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.40.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("stretching.time.45.minutes"));

        contentBuilder.append(PROPERTIES.getProperty("rolling.time.10.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("rolling.time.15.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("rolling.time.20.and.more"));
        stretchPanel.setText(contentBuilder.toString());


    }

    private void individualStretchingRollingMusclesButtons() {
        openLink();

        JButton bicepsAreasButton = new JButton();
        photoLabel.setLayout(null);
        bicepsAreasButton.setBackground(Color.red);
        bicepsAreasButton.setBounds(623, 113, 10, 10);
        photoLabel.add(bicepsAreasButton);

        JButton rhomboidsAreasButton = new JButton();
        photoLabel.setLayout(null);
        rhomboidsAreasButton.setBackground(Color.red);
        rhomboidsAreasButton.setBounds(170, 150, 10, 10);
        photoLabel.add(rhomboidsAreasButton);

        JButton chestAreasButton = new JButton();
        photoLabel.setLayout(null);
        chestAreasButton.setBackground(Color.red);
        chestAreasButton.setBounds(750, 180, 10, 10);
        photoLabel.add(chestAreasButton);

        JButton shoulderAreasButton = new JButton();
        photoLabel.setLayout(null);
        shoulderAreasButton.setBackground(Color.red);
        shoulderAreasButton.setBounds(120, 140, 10, 10);
        photoLabel.add(shoulderAreasButton);

        JButton hipAreasButton = new JButton();
        photoLabel.setLayout(null);
        hipAreasButton.setBackground(Color.red);
        hipAreasButton.setBounds(720, 320, 10, 10);
        photoLabel.add(hipAreasButton);

        JButton rotatorCuffAreasButton = new JButton();
        photoLabel.setLayout(null);
        rotatorCuffAreasButton.setBackground(Color.red);
        rotatorCuffAreasButton.setBounds(220, 130, 10, 10);
        photoLabel.add(rotatorCuffAreasButton);

        JButton tricepsAreasButton = new JButton();
        photoLabel.setLayout(null);
        tricepsAreasButton.setBackground(Color.red);
        tricepsAreasButton.setBounds(290, 110, 10, 10);
        photoLabel.add(tricepsAreasButton);

        JButton quadsAreasButton = new JButton();
        photoLabel.setLayout(null);
        quadsAreasButton.setBackground(Color.red);
        quadsAreasButton.setBounds(720, 380, 10, 10);
        photoLabel.add(quadsAreasButton);

        JButton latsAreasButton = new JButton();
        photoLabel.setLayout(null);
        latsAreasButton.setBackground(Color.red);
        latsAreasButton.setBounds(230, 200, 10, 10);
        photoLabel.add(latsAreasButton);

        JButton absAreasButton = new JButton();
        photoLabel.setLayout(null);
        absAreasButton.setBackground(Color.red);
        absAreasButton.setBounds(710, 250, 10, 10);
        photoLabel.add(absAreasButton);

        JButton obliqueAreasButton = new JButton();
        photoLabel.setLayout(null);
        obliqueAreasButton.setBackground(Color.red);
        obliqueAreasButton.setBounds(745, 245, 10, 10);
        photoLabel.add(obliqueAreasButton);

        JButton lowerBackAreasButton = new JButton();
        photoLabel.setLayout(null);
        lowerBackAreasButton.setBackground(Color.red);
        lowerBackAreasButton.setBounds(190, 270, 10, 10);
        photoLabel.add(lowerBackAreasButton);

        JButton neckAreasButton = new JButton();
        photoLabel.setLayout(null);
        neckAreasButton.setBackground(Color.red);
        neckAreasButton.setBounds(735, 130, 10, 10);
        photoLabel.add(neckAreasButton);

        JButton hamstringAreasButton = new JButton();
        photoLabel.setLayout(null);
        hamstringAreasButton.setBackground(Color.red);
        hamstringAreasButton.setBounds(165, 380, 10, 10);
        photoLabel.add(hamstringAreasButton);

        JButton calvesAreasButton = new JButton();
        photoLabel.setLayout(null);
        calvesAreasButton.setBackground(Color.red);
        calvesAreasButton.setBounds(310, 340, 10, 10);
        photoLabel.add(calvesAreasButton);

        JButton buttocksAreasButton = new JButton();
        photoLabel.setLayout(null);
        buttocksAreasButton.setBackground(Color.red);
        buttocksAreasButton.setBounds(220, 320, 10, 10);
        photoLabel.add(buttocksAreasButton);

        JButton forearmsAreasButton = new JButton();
        photoLabel.setLayout(null);
        forearmsAreasButton.setBackground(Color.red);
        forearmsAreasButton.setBounds(570, 90, 10, 10);
        photoLabel.add(forearmsAreasButton);

        JButton adductorsAreasButton = new JButton();
        photoLabel.setLayout(null);
        adductorsAreasButton.setBackground(Color.red);
        adductorsAreasButton.setBounds(640, 310, 10, 10);
        photoLabel.add(adductorsAreasButton);

        JButton abductorAreasButton = new JButton();
        photoLabel.setLayout(null);
        abductorAreasButton.setBackground(Color.red);
        abductorAreasButton.setBounds(290, 305, 10, 10);
        photoLabel.add(abductorAreasButton);


        bicepsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.biceps") + PROPERTIES.getProperty("rolling.biceps"));
            }
        });

        rhomboidsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.rhomboids") + PROPERTIES.getProperty("rolling.rhomboids"));
            }
        });

        chestAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.chest") + PROPERTIES.getProperty("rolling.chest"));
            }
        });

        shoulderAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.shoulder") + PROPERTIES.getProperty("rolling.shoulder"));
            }
        });

        hipAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.hip") + PROPERTIES.getProperty("rolling.hip"));
            }
        });

        rotatorCuffAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.rotator.cuff") + PROPERTIES.getProperty("rolling.rotator.cuff"));
            }
        });

        tricepsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.triceps") + PROPERTIES.getProperty("rolling.triceps"));
            }
        });

        quadsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.quads") + PROPERTIES.getProperty("rolling.quads"));
            }
        });

        latsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.lats") + PROPERTIES.getProperty("rolling.lats"));
            }
        });

        absAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.abs"));
            }
        });

        obliqueAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.oblique") + PROPERTIES.getProperty("rolling.abs.and.oblique"));
            }
        });

        lowerBackAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.lower.back") + PROPERTIES.getProperty("rolling.lower.back"));
            }
        });

        neckAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.neck") + PROPERTIES.getProperty("rolling.neck"));
            }
        });

        hamstringAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.hamstring") + PROPERTIES.getProperty("rolling.hamstring"));
            }
        });

        calvesAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.calves") + PROPERTIES.getProperty("rolling.calves"));
            }
        });

        buttocksAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.buttocks") + PROPERTIES.getProperty("rolling.buttocks"));
            }
        });

        forearmsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.forearms") + PROPERTIES.getProperty("rolling.forearms"));
            }
        });

        adductorsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.adductor") + PROPERTIES.getProperty("rolling.adductors"));
            }
        });

        abductorAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText(PROPERTIES.getProperty("stretching.abductor") + PROPERTIES.getProperty("rolling.abductor"));
            }
        });
    }

    public void openLink() {
        stretchPanel.setEditable(false);
        stretchPanel.setOpaque(false);

        stretchPanel.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent hle) {
                if (HyperlinkEvent.EventType.ACTIVATED.equals(hle.getEventType())) {
                    System.out.println(hle.getURL());
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(hle.getURL().toURI());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

    }
}


