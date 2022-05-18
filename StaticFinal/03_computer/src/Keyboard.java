public class Keyboard {
    private final String typeKeyboard;
    public static Backlight keyboardBackLight;
    private final double weightKeyboard;

    public Keyboard(String typeKeyboard, Backlight keyboardBacklight, double weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.weightKeyboard = weightKeyboard;
        Keyboard.keyboardBackLight = keyboardBacklight;
    }

    public Keyboard setTypeKeyboard(String typeKeyboard) {
        return new Keyboard(typeKeyboard, keyboardBackLight, weightKeyboard);
    }

    public Keyboard setKeyboardBackLight(Backlight keyboardBackLight) {
        return new Keyboard(typeKeyboard, keyboardBackLight, weightKeyboard);
    }

    public Keyboard setWeightKeyboard(double weightKeyboard) {
        return new Keyboard(typeKeyboard, keyboardBackLight, weightKeyboard);
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public double getWeightKeyboard() {
        return weightKeyboard;
    }

    public void setTotalWeight() {
        Computer.totalWeight = Computer.totalWeight + weightKeyboard;
    }

    public void setToString() {
        Computer.toString = Computer.toString + " \n 5.Клавиатура: \n - тип - " + typeKeyboard +
                "\n - наличие подсветки - " + keyboardBackLight + "\n - вес - " + weightKeyboard + " кг";
    }

}
