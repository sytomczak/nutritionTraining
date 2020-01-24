package pl.sytomczak.nutritiontraining.posturedefect;


public enum Treatment {

    LORDOSIS_TREATMENT("<br><a href='https://www.youtube.com/watch?v=QumlJTVhVCc'> Lordosis Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=V4d_mfMvoOQ'> Lordosis Link 2 <br></a>" + "<a href='https://www.youtube.com/watch?v=aHDmHugudSw'> Lordosis Link 3 <br></a>" + "<a href ='https://www.youtube.com/watch?v=oZH_eGCqGs8'>Lordosis Link 4 <br></a>" + "<a href='https://www.youtube.com/watch?v=OAcAT5kA5hU&feature=emb_title'>Lordosis Link 5 </a>" + "<br><a href='https://www.youtube.com/watch?v=IHvj6oeAhoU'>Lordosis Link 6 </a>"),
    SCOLIOSIS_TREATMENT("<br><a href='https://www.youtube.com/watch?v=dr4McYs3i_k'>Scoliosis Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=MPULUCKk1FQ'>Scoliosis Link 2 <br></a>" + "<a href='https://www.youtube.com/watch?v=i-y8pp5EfYw'>Scoliosis Link 3 <br></a>" + "<a href ='https://www.youtube.com/watch?v=wmk5Mvz4pe8'>Scoliosis Link 4 <br></a>" + "<a href='https://www.youtube.com/watch?v=rS8LBKOVWIo'>Scoliosis Link 5 </a>" + "<br><a href='https://www.youtube.com/watch?v=lmL_I98cIe8'>Scoliosis Link 6 </a>"),
    KYPHOSIS_TREATMENT("<br><a href='https://www.youtube.com/watch?v=qiy1DWI0Ccc'>Kyphosis Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=xH-hb6e6rys'>Kyphosis Link 2 <br></a>" + "<a href='https://www.youtube.com/watch?v=ELEYSyVWYxw'>Kyphosis Link 3 <br></a>" + "<a href ='https://www.youtube.com/watch?v=V4474JyX3A4'>Kyphosis Link 4 <br></a>" + "<a href='https://www.youtube.com/watch?v=fjgGaaqKuEo'>Kyphosis Link 5 </a>" + "<br><a href='https://www.youtube.com/watch?v=5pDrodSFO1I'>Kyphosis Link 6 </a>");

    private String filmInYouTube;

    Treatment(String filmInYouTube) {
        this.filmInYouTube = filmInYouTube;
    }

    public String getFilmInYouTube() {
        return filmInYouTube;
    }

    @Override
    public String toString() {
        return convertToHumanReadable(this.name());
    }

    private String convertToHumanReadable(String name) {
        name = name.replace('_',  ' ');
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase()+name.substring(1);
        return name;
    }
    }

