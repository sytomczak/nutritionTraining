package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.stretching.Stretching;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StretchingView extends JDialog {
    private JPanel contentPane;
    private JLabel photoLabel;
    private JEditorPane stretchPanel;
    private JButton fullBodyButton;
    private JButton buttonCancel;


    public StretchingView() {
        setContentPane(contentPane);
        setTitle("Stretching");
        contentPane.setPreferredSize(new Dimension(1100, 550));
        photoLabel.setIcon(new ImageIcon(getClass().getResource("/stre.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        individualStretchingMusclesButtons();
        fullBodyButton.addActionListener(e -> onSelectFullBodyButton());
    }

    public JEditorPane getStretchPanel() {
        return stretchPanel;
    }

    private void onSelectFullBodyButton() {
        stretchPanel.setText("Time 5 min: " + Stretching.TIME_5_MIN.getFilmInYouTube() + "\n" + ("Time 10 min: " + Stretching.TIME_10_MIN.getFilmInYouTube())
                + "\n" + ("Time 15 min: " + Stretching.TIME_15_MIN.getFilmInYouTube()) + "\n" + ("Time 20 min: " + Stretching.TIME_20_MIN.getFilmInYouTube())
                + "\n" + ("Time 25 min: " + Stretching.TIME_25_MIN.getFilmInYouTube()) + "\n" + ("Time 30 min: " + Stretching.TIME_30_MIN.getFilmInYouTube())
                + "\n" + ("Time 35 min: " + Stretching.TIME_35_MIN.getFilmInYouTube()) + "\n" + ("Time 40 min: " + Stretching.TIME_40_MIN.getFilmInYouTube())
                + "\n" + ("Time 45 min: " + Stretching.TIME_45_MIN.getFilmInYouTube()));
        openLink();


    }

    private void individualStretchingMusclesButtons() {
        JButton bicepsAreasButton = new JButton();
        photoLabel.setLayout(null);
        bicepsAreasButton.setBackground(Color.RED);
        bicepsAreasButton.setBounds(100, 100, 50, 50);
        photoLabel.add(bicepsAreasButton);

        bicepsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stretchPanel.setText("Biceps:" + Stretching.BICEPS.getFilmInYouTube());
                openLink();
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


