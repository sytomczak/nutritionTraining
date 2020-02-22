package pl.sytomczak.nutritiontraining.gui;

import pl.sytomczak.nutritiontraining.exerciseatlas.abdominalobliquemuscle.ExternalObliqueAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.biceps.BicepsAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMaximus;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMaximusExternalBottomAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMedius;
import pl.sytomczak.nutritiontraining.exerciseatlas.buttocks.GluteusMinimus;
import pl.sytomczak.nutritiontraining.exerciseatlas.calves.GastrocnemiusAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.calves.TibialisAnteriorAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.chestmuscles.PectoralisMajor;
import pl.sytomczak.nutritiontraining.exerciseatlas.chestmuscles.PectoralisMajorUpperPart;
import pl.sytomczak.nutritiontraining.exerciseatlas.deltoidmuscle.DeltoidAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.forearms.ForearmsAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.hamstring.BicepsFemorisAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.hamstring.GracilisAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.hamstring.TensorOfFasciaLataAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.musclesofback.ErectorSpinaeAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.musclesofback.LatissimusDorsiAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.musclesofback.TrapeziusAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.quadriceps.AdductorLongusArea;
import pl.sytomczak.nutritiontraining.exerciseatlas.quadriceps.VastusLateralisAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.rectusabdominismuscle.RectusAbdominisAreas;
import pl.sytomczak.nutritiontraining.exerciseatlas.triceps.TricepsAreas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtlasView extends JFrame {
    private JButton closeButton;
    private JPanel bodyJPanel;
    private JLabel photo1jLabel;
    private JScrollPane exerciseListingScrollPane;
    private JEditorPane exerciseListingPane;

    private GluteusMaximus gluteusMaximus;
    private GluteusMedius gluteusMedius;
    private GluteusMaximusExternalBottomAreas gluteusMaximusExternalBottomAreas;
    private GluteusMinimus gluteusMinimus;
    private BicepsFemorisAreas bicepsFemorisAreas;
    private GracilisAreas gracilisAreas;
    private TensorOfFasciaLataAreas tensorOfFasciaLataAreas;
    private GastrocnemiusAreas gastrocnemiusAreas;
    private TibialisAnteriorAreas tibialisAnteriorAreas;
    private AdductorLongusArea adductorLongusArea;
    private VastusLateralisAreas vastusLateralisAreas;
    private RectusAbdominisAreas rectusAbdominisAreas;
    private ExternalObliqueAreas externalObliqueAreas;
    private ErectorSpinaeAreas erectorSpinaeAreas;
    private LatissimusDorsiAreas latissimusDorsiAreas;
    private TrapeziusAreas trapeziusAreas;
    private PectoralisMajor pectoralisMajor;
    private PectoralisMajorUpperPart pectoralisMajorUpperPart;
    private DeltoidAreas deltoidAreas;
    private BicepsAreas bicepsAreas;
    private ForearmsAreas forearmsAreas;
    private TricepsAreas tricepsAreas;


    public AtlasView() {

        setContentPane(bodyJPanel);
        setTitle("Atlas");
        bodyJPanel.setPreferredSize(new Dimension(1000, 645));
        photo1jLabel.setIcon(new ImageIcon(getClass().getResource("/body.jpg")));
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

        JButton bicepsFemorisAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        bicepsFemorisAreasButton.setBounds(205, 370, 10, 10);
        photo1jLabel.add(bicepsFemorisAreasButton);

        JButton gracillisAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        gracillisAreasButton.setBounds(220, 330, 10, 10);
        photo1jLabel.add(gracillisAreasButton);

        JButton tensorOfFasciaLataAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        tensorOfFasciaLataAreasButton.setBounds(180, 330, 10, 10);
        photo1jLabel.add(tensorOfFasciaLataAreasButton);

        JButton gastrocnemiusAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        gastrocnemiusAreasButton.setBounds(200, 460, 10, 10);
        photo1jLabel.add(gastrocnemiusAreasButton);

        JButton tibialisAnteriorAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        tibialisAnteriorAreasButton.setBounds(410, 480, 10, 10);
        photo1jLabel.add(tibialisAnteriorAreasButton);

        JButton adductorLongusAreaButton = new JButton();
        photo1jLabel.setLayout(null);
        adductorLongusAreaButton.setBounds(410, 350, 10, 10);
        photo1jLabel.add(adductorLongusAreaButton);

        JButton vastusLateralisAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        vastusLateralisAreasButton.setBounds(430, 320, 10, 10);
        photo1jLabel.add(vastusLateralisAreasButton);

        JButton rectusAbdominisAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        rectusAbdominisAreasButton.setBounds(445, 210, 10, 10);
        photo1jLabel.add(rectusAbdominisAreasButton);

        JButton externalObliqueAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        externalObliqueAreasButton.setBounds(405, 200, 10, 10);
        photo1jLabel.add(externalObliqueAreasButton);

        JButton erectorSpinaeAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        erectorSpinaeAreasButton.setBounds(190, 200, 10, 10);
        photo1jLabel.add(erectorSpinaeAreasButton);

        JButton latissimusDorsiAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        latissimusDorsiAreasButton.setBounds(210, 170, 10, 10);
        photo1jLabel.add(latissimusDorsiAreasButton);

        JButton trapeziusAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        trapeziusAreasButton.setBounds(155, 120, 10, 10);
        photo1jLabel.add(trapeziusAreasButton);

        JButton pectoralisMajorButton = new JButton();
        photo1jLabel.setLayout(null);
        pectoralisMajorButton.setBounds(470, 150, 10, 10);
        photo1jLabel.add(pectoralisMajorButton);

        JButton pectoralisMajorUpperPartButton = new JButton();
        photo1jLabel.setLayout(null);
        pectoralisMajorUpperPartButton.setBounds(470, 120, 10, 10);
        photo1jLabel.add(pectoralisMajorUpperPartButton);

        JButton deltoidAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        deltoidAreasButton.setBounds(375, 110, 10, 10);
        photo1jLabel.add(deltoidAreasButton);

        JButton bicepsAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        bicepsAreasButton.setBounds(510, 170, 10, 10);
        photo1jLabel.add(bicepsAreasButton);

        JButton forearmsAreasButton = new JButton();
        photo1jLabel.setLayout(null);
        forearmsAreasButton.setBounds(515, 220, 10, 10);
        photo1jLabel.add(forearmsAreasButton);

        JButton tricepsAreasButtom = new JButton();
        photo1jLabel.setLayout(null);
        tricepsAreasButtom.setBounds(105, 145, 10, 10);
        photo1jLabel.add(tricepsAreasButtom);

        gluteusMaximusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMaximus = new GluteusMaximus();
                exerciseListingPane.setText(gluteusMaximus.getExercises());
            }
        });

        gluteusMediusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMedius = new GluteusMedius();
                exerciseListingPane.setText(gluteusMedius.getExercises());
            }
        });

        gluteusMaximusExternalBottomAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMaximusExternalBottomAreas = new GluteusMaximusExternalBottomAreas();
                exerciseListingPane.setText(gluteusMaximusExternalBottomAreas.getExercises());
            }
        });

        gluteusMinimusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gluteusMinimus = new GluteusMinimus();
                exerciseListingPane.setText(gluteusMinimus.getExercises());
            }
        });

        bicepsFemorisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bicepsFemorisAreas = new BicepsFemorisAreas();
                exerciseListingPane.setText(bicepsFemorisAreas.getExercises());
            }
        });

        gracillisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gracilisAreas = new GracilisAreas();
                exerciseListingPane.setText(gracilisAreas.getExercises());
            }
        });

        tensorOfFasciaLataAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tensorOfFasciaLataAreas = new TensorOfFasciaLataAreas();
                exerciseListingPane.setText(tensorOfFasciaLataAreas.getExercises());
            }
        });

        gastrocnemiusAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gastrocnemiusAreas = new GastrocnemiusAreas();
                exerciseListingPane.setText(gastrocnemiusAreas.getExercises());
            }
        });

        tibialisAnteriorAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tibialisAnteriorAreas = new TibialisAnteriorAreas();
                exerciseListingPane.setText(tibialisAnteriorAreas.getExercises());
            }
        });

        adductorLongusAreaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adductorLongusArea = new AdductorLongusArea();
                exerciseListingPane.setText(adductorLongusArea.getExercises());
            }
        });

        vastusLateralisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vastusLateralisAreas = new VastusLateralisAreas();
                exerciseListingPane.setText(vastusLateralisAreas.getExercises());
            }
        });

        rectusAbdominisAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rectusAbdominisAreas = new RectusAbdominisAreas();
                exerciseListingPane.setText(rectusAbdominisAreas.getExercises());
            }
        });

        externalObliqueAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                externalObliqueAreas = new ExternalObliqueAreas();
                exerciseListingPane.setText(externalObliqueAreas.getExercises());
            }
        });

        erectorSpinaeAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erectorSpinaeAreas = new ErectorSpinaeAreas();
                exerciseListingPane.setText(erectorSpinaeAreas.getExercises());
            }
        });

        latissimusDorsiAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                latissimusDorsiAreas = new LatissimusDorsiAreas();
                exerciseListingPane.setText(latissimusDorsiAreas.getExercises());
            }
        });

        trapeziusAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trapeziusAreas = new TrapeziusAreas();
                exerciseListingPane.setText(trapeziusAreas.getExercises());
            }
        });

        pectoralisMajorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pectoralisMajor = new PectoralisMajor();
                exerciseListingPane.setText(pectoralisMajor.getExercises());
            }
        });

        pectoralisMajorUpperPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pectoralisMajorUpperPart = new PectoralisMajorUpperPart();
                exerciseListingPane.setText(pectoralisMajorUpperPart.getExercises());
            }
        });

        deltoidAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deltoidAreas = new DeltoidAreas();
                exerciseListingPane.setText(deltoidAreas.getExercises());
            }
        });

        bicepsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bicepsAreas = new BicepsAreas();
                exerciseListingPane.setText(bicepsAreas.getExercises());
            }
        });

        forearmsAreasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forearmsAreas = new ForearmsAreas();
                exerciseListingPane.setText(forearmsAreas.getExercises());
            }
        });

        tricepsAreasButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tricepsAreas = new TricepsAreas();
                exerciseListingPane.setText(tricepsAreas.getExercises());
            }
        });
    }
}