public class WrongAmount extends Exception {
    private String er;
    public String getEr(){return er;}
    public WrongAmount (String comand,String error){
        super(comand);
        er = error;
    }

}
