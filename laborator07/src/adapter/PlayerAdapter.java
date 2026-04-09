package adapter;

// Convenience adapter: subclasses override only callbacks they care about.
public abstract class PlayerAdapter
        implements PlayerInterface {

    @Override
    public void onTrackStart(String trackName) {
        // no-op
    }

    @Override
    public void onTrackEnd(String trackName) {
        // no-op
    }

    @Override
    public void onVolumeChange(int newVolume) {
        // no-op
    }
}
