package A.compozitie;

public class RAM {

    private int size;
//    private String ddrType;
//    private double price;

    public RAM(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "size=" + size +
                '}';
    }
}
