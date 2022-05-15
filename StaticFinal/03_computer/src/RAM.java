public class RAM {
    private final   String typeRAM;
    private final   double volumeRAM;
    private final   double weightRAM;

    public RAM(String typeRAM , double volumeRAM , double weightRAM){
        this.typeRAM = typeRAM;
        this.volumeRAM = volumeRAM;
        this.weightRAM = weightRAM;
        setToString();
        setTotalWeight();
    }
    public RAM setTypeRAM(String typeRAM){
        return new RAM(typeRAM , volumeRAM , weightRAM);
    }
    public RAM setVolumeRAM(double volumeRAM){
        return new RAM(typeRAM , volumeRAM , weightRAM);
    }
    public RAM setWeightRAM( double weightRAM ){
        return new RAM(typeRAM , volumeRAM , weightRAM);
    }
    public String getTypeRAM(){
        return typeRAM;
    }
    public double getVolumeRAM(){
        return volumeRAM;
    }
    public double getWeightRAM(){
        return weightRAM;
    }
    public void setTotalWeight(){
        Computer.totalWeight = Computer.totalWeight + weightRAM;
    }
    public void setToString() {
        Computer.toString = Computer.toString +
                "\n 2.Оперативная память : \n - тип - " + typeRAM +
                "\n - обьем - " + volumeRAM + " Gb\n - вес - " + weightRAM + " кг";
    }
}
