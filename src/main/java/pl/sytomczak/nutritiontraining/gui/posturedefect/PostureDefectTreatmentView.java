package pl.sytomczak.nutritiontraining.gui.posturedefect;

import pl.sytomczak.nutritiontraining.posturedefect.*;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;

public class PostureDefectTreatmentView extends JDialog {

    private static PostureDefectTreatmentView windowInstance;

    private JPanel treatmentPanel;
    private JEditorPane treatmentEditorPane;
    private JScrollPane treatmentListingScrollPanel;

    private Treatment treatment;

    private PostureDefectTreatmentView() {
        setContentPane(treatmentPanel);
        setTitle("Treatment");
        treatmentPanel.setPreferredSize(new Dimension(200, 150));
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        openLink();
    }

    public void openLink() {
        treatmentEditorPane.setEditable(false);
        treatmentEditorPane.setOpaque(false);

        treatmentEditorPane.addHyperlinkListener(new HyperlinkListener() {
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


    public static PostureDefectTreatmentView getInstanceFor(String treatment) {
        if (windowInstance == null) windowInstance = new PostureDefectTreatmentView();
//        windowInstance.treatment = treatment;
        windowInstance.treatmentEditorPane.setText(treatment);
        return windowInstance;
    }
}

