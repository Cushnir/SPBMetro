public class InformationAccumulator {
    public static TypeInformationAccumulator typeInformationAccumulator;
    private final double volumeInformationAccumulator;
    private final double weightInformationAccumulator;

    public InformationAccumulator(TypeInformationAccumulator typeInformationAccumulator,
                                  double volumeInformationAccumulator,
                                  double weightInformationAccumulator) {
        InformationAccumulator.typeInformationAccumulator = typeInformationAccumulator;
        this.volumeInformationAccumulator = volumeInformationAccumulator;
        this.weightInformationAccumulator = weightInformationAccumulator;

    }

    public InformationAccumulator setTypeInformationAccumulator(TypeInformationAccumulator typeInformationAccumulator) {
        return new InformationAccumulator(
                typeInformationAccumulator,
                volumeInformationAccumulator,
                weightInformationAccumulator);
    }

    public InformationAccumulator setVolumeInformationAccumulator(double volumeInformationAccumulator) {
        return new InformationAccumulator(
                typeInformationAccumulator,
                volumeInformationAccumulator,
                weightInformationAccumulator);
    }

    public InformationAccumulator setWeightInformationAccumulator(double weightInformationAccumulator) {
        return new InformationAccumulator(
                typeInformationAccumulator,
                volumeInformationAccumulator,
                weightInformationAccumulator);
    }

    public TypeInformationAccumulator getTypeInformationAccumulator() {
        return typeInformationAccumulator;
    }

    public double getVolumeInformationAccumulator() {
        return volumeInformationAccumulator;
    }

    public double getWeightInformationAccumulator() {
        return weightInformationAccumulator;
    }

    public void setTotalWeight() {
        Computer.totalWeight = Computer.totalWeight + weightInformationAccumulator;
    }

    public void setToString() {
        Computer.toString = Computer.toString + "\n 3.Накопитель информации : \n - тип - " + InformationAccumulator.typeInformationAccumulator +
                "\n - обьем памяти - " + volumeInformationAccumulator +
                " Tb\n - вес - " + weightInformationAccumulator + " кг";
    }
}
