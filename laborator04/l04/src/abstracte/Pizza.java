package abstracte;

public abstract class Pizza {
    private String sauce;

    public Pizza() {
    }

    public Pizza(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public abstract void prepare();
}
