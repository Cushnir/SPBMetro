public class Screen {
    private final double diagonalScreen;
    public static TypeScreen typeScreen;
    private final double weightScreen;

    public Screen(double diagonalScreen, TypeScreen typeScreen, double weightScreen) {
        this.diagonalScreen = diagonalScreen;
        Screen.typeScreen = typeScreen;
        this.weightScreen = weightScreen;
    }

    public Screen setDiagonalScreen(double diagonalScreen) {
        return new Screen(diagonalScreen, typeScreen, weightScreen);

    }

    public Screen setTypeScreen(TypeScreen typeScreen) {
        return new Screen(diagonalScreen, typeScreen, weightScreen);

    }

    public Screen setWeightScreen(double weightScreen) {
        return new Screen(diagonalScreen, typeScreen, weightScreen);

    }

    public double setDiagonalScreen() {
        return diagonalScreen;
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public double getWeightScreen() {
        return weightScreen;
    }

    public void setTotalWeight() {
        Computer.totalWeight = Computer.totalWeight + weightScreen;
    }

    public void setToString() {
        Computer.toString = Computer.toString + "\n 4.Ёкран : \n - диагональ - " + diagonalScreen + "\n - тип - "
                + Screen.typeScreen + "\n - вес - " + weightScreen + " кг";
    }
}
