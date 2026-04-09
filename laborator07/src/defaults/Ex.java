package defaults;

public class Ex {
    public static void main(String[] args) {
        MusicTrack track = new MusicTrack();
        track.play();

        AudioAd audioAd = new AudioAd();
        audioAd.play();

        Playable.stop();
    }
}
