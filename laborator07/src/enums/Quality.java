package enums;

public enum Quality {

    LOW(128),
    MEDIUM(256),
    HIGH(320);

    private final int bitRate;

    Quality(int bitRate) {
        this.bitRate = bitRate;
    }

    public int getBitRate() {
        return bitRate;
    }
}
