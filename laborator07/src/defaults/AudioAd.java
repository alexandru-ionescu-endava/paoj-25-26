package defaults;

public class AudioAd
        implements Playable {

    @Override
    public void play() {
        System.out.println("Playing audio ad...");
    }
}
