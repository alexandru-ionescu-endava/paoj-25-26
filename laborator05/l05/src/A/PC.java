package A;

import A.agregare.Periferice;
import A.compozitie.CPU;
import A.compozitie.MotherBoard;
import A.compozitie.RAM;

public class PC {

//    compozitie
    private MotherBoard motherboard;
    private CPU cpu;
    private RAM ram;

//    private GPU gpu;

//    agregare
    private Periferice periferice;

    public PC(MotherBoard motherboard, CPU cpu, RAM ram) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
    }

    public PC(MotherBoard motherboard, CPU cpu, RAM ram, Periferice periferice) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.periferice = periferice;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Periferice getPeriferice() {
        return periferice;
    }

    public void setPeriferice(Periferice periferice) {
        this.periferice = periferice;
    }

    @Override
    public String toString() {
        return "PC{" +
                "motherboard=" + motherboard +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", periferice=" + periferice +
                '}';
    }
}
