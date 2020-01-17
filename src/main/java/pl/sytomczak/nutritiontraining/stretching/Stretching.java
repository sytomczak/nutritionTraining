package pl.sytomczak.nutritiontraining.stretching;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public enum Stretching {

    TIME_45_MIN("\n"+ "https://www.youtube.com/watch?v=GLy2rYHwUqY" + "  " + "https://www.youtube.com/watch?v=H5gopfa7zxs" + "  " + "https://www.youtube.com/watch?v=ALO4udhcXuk" + "  " + "https://www.youtube.com/watch?v=l59RmHmQcGc"),
    TIME_40_MIN("https://www.youtube.com/watch?v=VVPyAU4l-sw" + "  " + "https://www.youtube.com/watch?v=voaJn6wsgq0" + "  " + "https://www.youtube.com/watch?v=9kOCY0KNByw" + "  " + "https://www.youtube.com/watch?v=y_15AZv-27o"),
    TIME_35_MIN("https://www.youtube.com/watch?v=7h_Pn7NyJ0k" + "  " + "https://www.youtube.com/watch?v=wQCB8mjSTEg" + "  " + "https://www.youtube.com/watch?v=tV3w3ioCZB4" + "  " + "https://www.youtube.com/watch?v=fAIodmy5BEU"),
    TIME_30_MIN("https://www.youtube.com/watch?v=pavRUoAT1FQ" + "  " + "https://www.youtube.com/watch?v=DjQdM5bTAnA" + "  " + "https://www.youtube.com/watch?v=3SZ2xVnbcxY" + "  " + "https://www.youtube.com/watch?v=YELQ2Yeh19s"),
    TIME_25_MIN("https://www.youtube.com/watch?v=xWuLI-e6gWI" + "  " + "https://www.youtube.com/watch?v=eRb1-IteLgY" + "  " + "https://www.youtube.com/watch?v=DpZHJg4qy80" + "  " + "https://www.youtube.com/watch?v=DAO1QtOPapg"),
    TIME_20_MIN("https://www.youtube.com/watch?v=SBEILAHNBSI" + "  " + "https://www.youtube.com/watch?v=lPKRiU9u_Hc" + "  " + "https://www.youtube.com/watch?v=9UQunFRrdCc" + "  " + "https://www.youtube.com/watch?v=1fztE4mK7C0"),
    TIME_15_MIN("https://www.youtube.com/watch?v=p39UHZ7h5OA" + "  " +  "https://www.youtube.com/watch?v=8GL73mrsvJ8" + "  " + "https://www.youtube.com/watch?v=E2SOrScNbww" + "  " + "https://www.youtube.com/watch?v=L_xrDAtykMI"),
    TIME_10_MIN("https://www.youtube.com/watch?v=KJaWIBg15n0" + "  " + "https://www.youtube.com/watch?v=sTxC3J3gQEU" + "  " + "https://www.youtube.com/watch?v=OIww1jSfnsM" + "  " + "https://www.youtube.com/watch?v=kKeBjBBUQyY"),
    TIME_5_MIN("https://www.youtube.com/watch?v=2L2lnxIcNmo" + "  " + "https://www.youtube.com/watch?v=6AgSw1QFltw" + "  " + "https://www.youtube.com/watch?v=KmwkMPnzL40" + "  " + "https://www.youtube.com/watch?v=ep0ABNIrwtA" + "  " + "https://www.youtube.com/watch?v=4zBnM_uozXM"),

    BICEPS_BICEPS("https://www.youtube.com/watch?v=GLy2rYHwUqY");


    private String filmInYouTube;

    Stretching(String filmInYouTube) {this.filmInYouTube = filmInYouTube;
//        try {
//
//            Desktop.getDesktop().browse(new URI(filmInYouTube));
//
//        } catch (IOException | URISyntaxException e1) {
//            e1.printStackTrace();
//        }
    }
    public String getFilmInYouTube() {
        return filmInYouTube;}


    @Override
    public String toString() {
        return convertToHumanReadable(this.name());
    }

    private String convertToHumanReadable(String name) {
        name = name.replace('_',  ' ');
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase()+name.substring(1);
        return name ;
    }

}
