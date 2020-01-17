package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.stretching.BicepsFemorisAreasButton;
import pl.sytomczak.nutritiontraining.stretching.FullBodyStretching;
import pl.sytomczak.nutritiontraining.stretching.Stretching;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Uri;

public class StretchingView extends JDialog {
    private JPanel contentPane;
    private JLabel photoLabel;
    private JEditorPane stretchPanel;
    private JButton fullBodyButton;
    private JButton buttonCancel;

    private FullBodyStretching fullBodyStretching;
    private BicepsFemorisAreasButton bicepsFemorisAreas;


    public StretchingView() {
        setContentPane(contentPane);
        setTitle("Stretching");
        contentPane.setPreferredSize(new Dimension(1350, 550));
        photoLabel.setIcon(new ImageIcon(getClass().getResource("/stre.jpg")));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        individualStretchingMusclesButtons();
        fullBodyButton.addActionListener(e -> onSelectFullBodyButton());
    }

    private void onSelectFullBodyButton() {
        fullBodyStretching = new FullBodyStretching();
        stretchPanel.setText("Time 5 min: " + " -> " + Stretching.TIME_5_MIN.getFilmInYouTube() + "\n" + ("Time 10 min: " + " -> " + Stretching.TIME_10_MIN.getFilmInYouTube())
                + "\n" + ("Time 15 min: " + " -> " + Stretching.TIME_15_MIN.getFilmInYouTube()) + "\n" + ("Time 20 min: " + " -> " + Stretching.TIME_20_MIN.getFilmInYouTube())
                + "\n" + ("Time 25 min: " + " -> " + Stretching.TIME_25_MIN.getFilmInYouTube()) + "\n" + ("Time 30 min: " + " -> " + Stretching.TIME_30_MIN.getFilmInYouTube())
                + "\n" + ("Time 35 min: " + " -> " + Stretching.TIME_35_MIN.getFilmInYouTube()) + "\n" + ("Time 40 min: " + " -> " + Stretching.TIME_40_MIN.getFilmInYouTube())
                + "\n" + ("Time 45 min: " + " -> " + Stretching.TIME_45_MIN.getFilmInYouTube()));


    }

    private void individualStretchingMusclesButtons() {
        JButton bicepsFemorisAreasButton = new JButton();
        photoLabel.setLayout(null);
        bicepsFemorisAreasButton.setBackground(Color.RED);
        bicepsFemorisAreasButton.setBounds(100, 100, 50, 50);
        photoLabel.add(bicepsFemorisAreasButton);

        bicepsFemorisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bicepsFemorisAreas = new BicepsFemorisAreasButton();
                stretchPanel.setText(bicepsFemorisAreas.getStretchingList().toString());
            }
        });


    }

}
