package diamond;

public class VideoPodcast
        implements Audible, Visual {

    @Override
    public void prepare() {

        Audible.super.prepare();
        Visual.super.prepare();

        System.out.println("Video podcast is ready to play!");
    }

}
