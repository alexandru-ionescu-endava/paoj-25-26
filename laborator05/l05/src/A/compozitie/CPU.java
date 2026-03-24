package A.compozitie;

public class CPU {

    private String model;

    public CPU(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                '}';
    }
}
