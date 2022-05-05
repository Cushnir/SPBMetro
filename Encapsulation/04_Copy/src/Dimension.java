public class Dimension {
    private final int height;
    private final int widht;
    private final int lenght;

    public Dimension(int height, int widht, int lenght) {
        this.height = height;
        this.widht = widht;
        this.lenght = lenght;
    }

    public Dimension setHight(int height) {
        return new Dimension(height, widht, lenght);
    }

    public Dimension setWight(int widht) {
        return new Dimension(height, widht, lenght);
    }

    public Dimension setLenght(int lenght) {
        return new Dimension(height, widht, lenght);
    }

    public int setVolume() {
        int volume = height * widht * lenght;
        return volume;
    }

}
