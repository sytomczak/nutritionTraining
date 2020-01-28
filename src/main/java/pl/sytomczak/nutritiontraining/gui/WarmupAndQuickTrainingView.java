package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.ApplicationProperties;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.util.Properties;

public class WarmupAndQuickTrainingView extends JFrame {
    private JPanel contentPane;
    private JEditorPane warmUpEditorPane1;
    private JEditorPane quickTrainingEditorPane;

    private static final Properties PROPERTIES = ApplicationProperties.INSTANCE.getProperties();

    public WarmupAndQuickTrainingView() {
        setContentPane(contentPane);
        setTitle("Warm-up & Quick Training");
        contentPane.setPreferredSize(new Dimension(400, 400));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        warmUpEditorPane1.setText(PROPERTIES.getProperty("warm.up"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PROPERTIES.getProperty("quick.training.5.minutes"));
        stringBuilder.append(PROPERTIES.getProperty("quick.training.10.minutes"));
        stringBuilder.append(PROPERTIES.getProperty("quick.training.15.minutes"));
        stringBuilder.append(PROPERTIES.getProperty("quick.training.20.minutes"));
        stringBuilder.append(PROPERTIES.getProperty("quick.training.25.minutes"));
        stringBuilder.append(PROPERTIES.getProperty("quick.training.30.minutes"));
        quickTrainingEditorPane.setText(stringBuilder.toString());


        openLink();
    }
        public void openLink() {
            warmUpEditorPane1.setEditable(false);
            warmUpEditorPane1.setOpaque(false);

            warmUpEditorPane1.addHyperlinkListener(new HyperlinkListener() {
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
