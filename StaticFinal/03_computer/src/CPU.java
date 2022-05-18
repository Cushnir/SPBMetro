public class CPU {
    private final double freguensyCPU;
    public final int numerOfCoresCPU;
    private final String manufacturerCPU;
    private final double theWeightCPU;

    public CPU(double freguensyCPU, int numerOfCoresCPU, String manufacturerCPU, double theWeightCPU) {
        this.freguensyCPU = freguensyCPU;
        this.numerOfCoresCPU = numerOfCoresCPU;
        this.manufacturerCPU = manufacturerCPU;
        this.theWeightCPU = theWeightCPU;
    }

    public CPU setFreguensyCPU(double freguensyCPU) {
        return new CPU(freguensyCPU, numerOfCoresCPU, manufacturerCPU, theWeightCPU);
    }

    public CPU seNumerOfCOresCPU(int numerOfCoresCPU) {
        return new CPU(freguensyCPU, numerOfCoresCPU, manufacturerCPU, theWeightCPU);
    }

    public CPU setManufacturerCPU(String manufacturerCPU) {
        return new CPU(freguensyCPU, numerOfCoresCPU, manufacturerCPU, theWeightCPU);
    }

    public CPU setTheWeightCPU(double theWeightCPU) {
        return new CPU(freguensyCPU, numerOfCoresCPU, manufacturerCPU, theWeightCPU);
    }

    public double getFreguensyCPU() {
        return freguensyCPU;
    }

    public int getNumerOfCoresCPU() {
        return numerOfCoresCPU;
    }

    public String getManufacturerCPU() {
        return manufacturerCPU;
    }

    public double getTheWeightCPU() {
        return theWeightCPU;
    }

    public void setTotalWeight() {
        Computer.totalWeight = Computer.totalWeight + theWeightCPU;
    }

    public void setToString() {
        Computer.toString = Computer.toString + " \n 1. Процессор : \n - частота - " + freguensyCPU +
                " Hz\n - количество ядер - " + numerOfCoresCPU + "\n - производитель - " + manufacturerCPU +
                "\n - вес - " + theWeightCPU + " кг";
    }
}
