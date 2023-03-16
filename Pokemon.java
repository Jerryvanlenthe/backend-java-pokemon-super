public abstract class Pokemon {

    private String type;
    private String name;


    //Constructor
    public Pokemon(String type, String name) {
        this.type = type;
        this.name = name;
    }

    //Getters
    public  String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    //Setters
    public void setType(String type){
        this.type = type;
    }
    public void setName (String name){
        this.name = name;
    }

    abstract void setArray();

}
