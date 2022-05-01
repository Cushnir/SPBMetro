public class Laptop {
    private int numerOfCores = 0;
    private int amountOfRam = 0;
    private String videoCard = "";
    private double displaySize = 0.0;
    private boolean bluetooth;
    private int batteryCapacity;

    public Laptop(int numerOfCores, int amountOfRam, String videoCard) {
        this.numerOfCores = numerOfCores;
        this.amountOfRam = amountOfRam;
        this.videoCard = videoCard;
    }

    public void setNumerOfCores(int numerOfCores) {
        this.numerOfCores = numerOfCores;
    }

    public int getNumerOfCores() {
        return numerOfCores;
    }

    public void setAmountOfRam(int amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    public int getAmountOfRam() {
        return amountOfRam;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
