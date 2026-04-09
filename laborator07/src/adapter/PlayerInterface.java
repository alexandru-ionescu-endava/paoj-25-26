package adapter;

public interface PlayerInterface {

    void onTrackStart(String trackName);

    void onTrackEnd(String trackName);

    void onVolumeChange(int newVolume);
}
