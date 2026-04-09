package adapter;

public class Ex {
    public static void main(String[] args) {

        System.out.println("TrackLogger via PlayerInterface (track callbacks only):");
        PlayerInterface trackPlayer = new TrackLogger();
        trackPlayer.onTrackStart("Song A");
        trackPlayer.onVolumeChange(5); // no-op inherited from adapter
        trackPlayer.onTrackEnd("Song A");

        System.out.println("===");

        System.out.println("VolumeLogger via PlayerInterface (volume callback only):");
        PlayerInterface volumePlayer = new VolumeLogger();
        volumePlayer.onTrackStart("Song B"); // no-op inherited from adapter
        volumePlayer.onVolumeChange(10);
        volumePlayer.onTrackEnd("Song B"); // no-op inherited from adapter

    }
}
