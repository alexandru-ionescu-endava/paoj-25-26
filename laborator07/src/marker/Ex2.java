package marker;

public class Ex2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Podcast podcast = new Podcast("Tech Talk", new Genre("Technology"));
        downloadIfPossible(podcast);

        Podcast copy = podcast.clone();
        podcast.getGenre().setName("TEST");

        System.out.println("Original: " + podcast);
        System.out.println("Copy: " + copy);
        System.out.println("Same object? " + (podcast == copy));
        System.out.println("Same genre reference? " + (podcast.getGenre() == copy.getGenre()));
    }

    private static void downloadIfPossible(Object media) {
        if (media instanceof Downloadable) {
            System.out.println(media.getClass().getSimpleName() + " can be downloaded");
        } else {
            System.out.println(media.getClass().getSimpleName() + " cannot be downloaded");
        }
    }
}
