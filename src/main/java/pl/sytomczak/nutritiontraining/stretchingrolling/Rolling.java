package pl.sytomczak.nutritiontraining.stretchingrolling;

public enum Rolling {
    
    BICEPS("<br><a href='https://www.youtube.com/watch?v=lLc68MNSwZ8'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=_MRRwLlVZxY'> Link 2 <br></a>"),
    RHOMBOIDS("<br><a href='https://www.youtube.com/watch?v=yYmzxoKnQRE'> Link 1 <br> </a>" + "<a href='https://www.youtube.com/watch?v=VUXnptJLG4g'> Link 2 <br> </a>"),
    CHEST("<br><a href='https://www.youtube.com/watch?v=HBRES3n8d7c'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=8BquMJBShks'> Link 2 <br></a>"),
    SHOULDER("<br><a href='https://www.youtube.com/watch?v=nf8YNgduW9U'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=5Uu7zx75jz8'> Link 2 <br></a>"),
    HIP(" <br><a href='https://www.youtube.com/watch?v=BkMafvy1Toc'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=U8JvMNg3eCE'> Link 2 <br></a>"),
    ROTATOR_CUFF("<br><a href='https://www.youtube.com/watch?v=s7muoAD08x4'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=HG7l8ILK8l4'> Link 2 <br></a>"),
    TRICEPS("<br><a href='https://www.youtube.com/watch?v=Ma2O-xa_9k0'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=GNsuRw1rOyM'> Link 2 <br></a>"),
    QUADS("<br><a href='https://www.youtube.com/watch?v=UsyAhd07HoA'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=Ukk_LNN_uPc'> Link 2 <br></a>"),
    LATS("<br><a href='https://www.youtube.com/watch?v=ht2_L4wGH4w'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=i-gYAkuYzDI'> Link 2 <br></a>"),
    ABS_AND_OBLIQUE("<br><a href='https://www.youtube.com/watch?v=Sjse6MLrf0Y'> Link 1 <br></a>"),
    LOWER_BACK("<br><a href='https://www.youtube.com/watch?v=ePDIhxIf2CI'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=MnWWDAsEfXk'> Link 2 <br></a>"),
    NECK("<br><a href='https://www.youtube.com/watch?v=JM8lAIIKfYA'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=iYYOGYcviK0'> Link 2 <br></a>"),
    HAMSTRING("<br><a href='https://www.youtube.com/watch?v=78ZE9Dznsfg'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=fMfe6DnlGvA'> Link 2 <br></a>"),
    CALVES("<br><a href='https://www.youtube.com/watch?v=-xPLnDiGfAY'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=UwSzyw4KwNU'> Link 2 <br></a>"),
    BUTTOCKS("<br><a href='https://www.youtube.com/watch?v=4Ch8iu7Y4HQ'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=lXGnSJ63_vM'> Link 2 <br></a>"),
    FOREARMS("<br><a href='https://www.youtube.com/watch?v=1hDpr0r_izc'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=9E_b1hk-zeE'> Link 2 <br></a>"),
    ADDUCTORS("<br><a href='https://www.youtube.com/watch?v=C1xQbJhcVyU'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=EzmlrFeTVUY'> Link 2 <br></a>"),
    ABDUCTOR("<br><a href='https://www.youtube.com/watch?v=AttimZ_OJuE'> Link 1 <br></a>" + "<a href='https://www.youtube.com/watch?v=-nHgue0Jzdw'> Link 2 <br></a>");

    private String filmInYouTube;

    Rolling(String filmInYouTube) {
        this.filmInYouTube = filmInYouTube;
    }

    public String getFilmInYouTube() {
        return filmInYouTube;
    }

}
