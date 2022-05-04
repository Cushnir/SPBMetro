public class Delivery {
    private final double weight;
    private final String diliveryAddress;
    private final String registationNumer;
    private final boolean doNotTurn;
    private final boolean fragiLeCargo;

    public Delivery(double weight,
                    String diliveryAddress,
                    String registationNumer,
                    boolean doNotTurn,
                    boolean fragiLeCargo) {
        this.weight = weight;
        this.diliveryAddress = diliveryAddress;
        this.registationNumer = registationNumer;
        this.doNotTurn = doNotTurn;
        this.fragiLeCargo = fragiLeCargo;
    }
    public Delivery setDiliveryAdress(String diliveryAddress) {
        return new Delivery(weight, diliveryAddress, registationNumer, doNotTurn, fragiLeCargo);
    }

    public Delivery setWeight(double weight) {
        return new Delivery(weight, diliveryAddress, registationNumer, doNotTurn, fragiLeCargo);
    }
    public double getWeight(){
        return weight;
    }
    public String getRegistationNumer(){
        return getRegistationNumer();
    }
    public  boolean getDoNotTurn(){
        return doNotTurn;
    }
    public boolean getFragiLeCargo(){
        return fragiLeCargo;
    }

}


