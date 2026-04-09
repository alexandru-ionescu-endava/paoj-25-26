package adapter;

public class VolumeLogger extends PlayerAdapter {

    @Override
    public void onVolumeChange(int newVolume) {
        System.out.println("Volume changed to: " + newVolume);
    }
}
