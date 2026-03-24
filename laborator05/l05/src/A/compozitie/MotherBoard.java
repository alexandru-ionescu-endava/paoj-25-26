package A.compozitie;

public class MotherBoard {
    private String model;
    private String manufacturer;

    public MotherBoard(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
