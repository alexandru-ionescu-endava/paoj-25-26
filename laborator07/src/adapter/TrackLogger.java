package adapter;

public class TrackLogger extends PlayerAdapter {

    @Override
    public void onTrackStart(String trackName) {
        System.out.println("Track started: " + trackName);
    }

    @Override
    public void onTrackEnd(String trackName) {
        System.out.println("Track ended: " + trackName);
    }
}
