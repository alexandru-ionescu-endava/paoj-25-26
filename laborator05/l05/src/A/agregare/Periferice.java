package A.agregare;

public class Periferice {

    private String mouse;
    private String keyboard;

    public Periferice(String mouse, String keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Periferice{" +
                "mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
