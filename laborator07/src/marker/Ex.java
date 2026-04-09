package marker;

public class Ex {
    public static void main(String[] args) throws CloneNotSupportedException {

        Song song = new Song("Bohemian Rhapsody");
        LiveStream liveStream = new LiveStream();

        downloadIfPossible(song);
        downloadIfPossible(liveStream);

    }

    private static void downloadIfPossible(Object media) {
        if (media instanceof Downloadable) {
            System.out.println(media.getClass().getSimpleName() + " can be downloaded");
        } else {
            System.out.println(media.getClass().getSimpleName() + " cannot be downloaded");
        }
    }
}
