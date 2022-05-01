public class Country {
    private String name = "";
    private int population = 0;
    private int square = 0;
    private String nameOfTheCapotal = "";
    private Boolean accessToTheSea;
    public Country (String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public int getSquare(){
        return square;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public int getPopulation(){
        return population;
    }
    public void setNameOfTheCapotal(String nameOfTheCapotal){
        this.nameOfTheCapotal = nameOfTheCapotal;
    }
    public String getNameOfTheCapotal(){
        return nameOfTheCapotal;
    }
    public void setAccessToTheSea(boolean accessToTheSea){
        this.accessToTheSea = accessToTheSea;
    }
    public boolean getAccessToTheSea(){
        return accessToTheSea;
    }





}

