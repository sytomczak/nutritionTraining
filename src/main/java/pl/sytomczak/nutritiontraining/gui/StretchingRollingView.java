package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.ApplicationProperties;
import pl.sytomczak.nutritiontraining.stretchingrolling.Rolling;
import pl.sytomczak.nutritiontraining.stretchingrolling.Stretching;

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
//        stretchPanel.setText("<b>Stretching</b>" + "<br>" + "Time 5 min: " + Stretching.TIME_5_MIN.getFilmInYouTube() + "\n" + ("Time 10 min: " + Stretching.TIME_10_MIN.getFilmInYouTube())
//                + "\n" + ("Time 15 min: " + Stretching.TIME_15_MIN.getFilmInYouTube()) + "\n" + ("Time 20 min: " + Stretching.TIME_20_MIN.getFilmInYouTube())
//                + "\n" + ("Time 25 min: " + Stretching.TIME_25_MIN.getFilmInYouTube()) + "\n" + ("Time 30 min: " + Stretching.TIME_30_MIN.getFilmInYouTube())
//                + "\n" + ("Time 35 min: " + Stretching.TIME_35_MIN.getFilmInYouTube()) + "\n" + ("Time 40 min: " + Stretching.TIME_40_MIN.getFilmInYouTube())
//                + "\n" + ("Time 45 min: " + Stretching.TIME_45_MIN.getFilmInYouTube())
//
//                + "\n" + ("<b>Rolling</b>" + "<br>" + "Time 10 min: " + Rolling.TIME_10_MIN.getFilmInYouTube()) + "\n" + ("Time 15 min: " + Rolling.TIME_15_MIN.getFilmInYouTube())
//                + "\n" + ("Time 20 and more: " + Rolling.TIME_20_AND_MORE.getFilmInYouTube()));


        StringBuilder contentBuilder = new StringBuilder();
        contentBuilder.append(PROPERTIES.getProperty("rolling.time.10.minutes"));
        contentBuilder.append(PROPERTIES.getProperty("rolling.time.15.minutes"));
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
                        //"<b>Biceps</b>" + "<br>" + "Stretching" + Stretching.BICEPS.getFilmInYouTube() + "Rolling" + Rolling.BICEPS.getFilmInYouTube());
            }
        });

        rhomboidsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Rhomboids</b>" + "<br>" + "Stretching" + Stretching.RHOMBOIDS.getFilmInYouTube() + "Rolling" + Rolling.RHOMBOIDS.getFilmInYouTube());
            }
        });

        chestAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Chest</b>" + "<br>" + "Stretching" + Stretching.CHEST.getFilmInYouTube() + "Rolling" + Rolling.CHEST.getFilmInYouTube());
            }
        });

        shoulderAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Shoulder</b>" + "<br>" + "Stretching" + Stretching.SHOULDER.getFilmInYouTube() + "Rolling" + Rolling.SHOULDER.getFilmInYouTube());
            }
        });

        hipAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Hip</b>" + "<br>" + "Stretching" + Stretching.HIP.getFilmInYouTube() + "Rolling" + Rolling.HIP.getFilmInYouTube());
            }
        });

        rotatorCuffAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Rotator Cuff</b>" + "<br>" + "Stretching" + Stretching.ROTATOR_CUFF.getFilmInYouTube() + "Rolling" + Rolling.ROTATOR_CUFF.getFilmInYouTube());
            }
        });

        tricepsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Triceps</b>" + "<br>" + "Stretching" + Stretching.TRICEPS.getFilmInYouTube() + "Rolling" + Rolling.TRICEPS.getFilmInYouTube());
            }
        });

        quadsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Quads</b>" + "<br>" + "Stretching" + Stretching.QUADS.getFilmInYouTube() + "Rolling" + Rolling.QUADS.getFilmInYouTube());
            }
        });

        latsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Lats</b>" + "<br>" + "Stretching" + Stretching.LATS.getFilmInYouTube() + "Rolling" + Rolling.LATS.getFilmInYouTube());
            }
        });

        absAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>ABS</b>" + "<br>" + "Stretching" + Stretching.ABS_AND_OBLIQUE.getFilmInYouTube());
            }
        });

        obliqueAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Oblique</b>" + "<br>" + "Stretching" + Stretching.ABS_AND_OBLIQUE.getFilmInYouTube() + "Rolling" + Rolling.ABS_AND_OBLIQUE.getFilmInYouTube());
            }
        });

        lowerBackAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Lower back</b>" + "<br>" + "Stretching" + Stretching.LOWER_BACK.getFilmInYouTube() + "Rolling" + Rolling.LOWER_BACK.getFilmInYouTube());
            }
        });

        neckAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Neck</b>" + "<br>" + "Stretching" + Stretching.NECK.getFilmInYouTube() + "Rolling" + Rolling.NECK.getFilmInYouTube());
            }
        });

        hamstringAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Hamstring</b>" + "<br>" + "Stretching" + Stretching.HAMSTRING.getFilmInYouTube() + "Rolling" + Rolling.HAMSTRING.getFilmInYouTube());
            }
        });

        calvesAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Calves</b>" + "<br>" + "Stretching" + Stretching.CALVES.getFilmInYouTube() + "Rolling" + Rolling.CALVES.getFilmInYouTube());
            }
        });

        buttocksAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Buttocks</b>" + "<br>" + "Stretching" + Stretching.BUTTOCKS.getFilmInYouTube() + "Rolling" + Rolling.BUTTOCKS.getFilmInYouTube());
            }
        });

        forearmsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Foreamrs</b>" + "<br>" + "Stretching" + Stretching.FOREARMS.getFilmInYouTube() + "Rolling" + Rolling.FOREARMS.getFilmInYouTube());
            }
        });

        adductorsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Adductors</b>" + "<br>" + "Stretching" + Stretching.ADDUCTORS.getFilmInYouTube() + "Rolling" + Rolling.ADDUCTORS.getFilmInYouTube());
            }
        });

        abductorAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("<b>Abductor</b>" + "<br>" + "Stretching" + Stretching.ABDUCTOR.getFilmInYouTube() + "Rolling" + Rolling.ABDUCTOR.getFilmInYouTube());
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


