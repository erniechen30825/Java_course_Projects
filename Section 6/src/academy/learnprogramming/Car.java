package academy.learnprogramming;

public class Car {
    //Public means unrestricted access <-> private
    // class = blueprint for object going to create
    // classes allows us to create variables that are available
    // everywhere within the class -> "fields"
    // when creating a filed , also need to specify an excess
    // modifier that works the same way as excess modifier
    // for the class  definition did
    // As a general rule, when defining fields in Java in a class
    // you go with access modifier "private"
    //private is doing
    // -> "encapsulation"
    // -> used to hide fields and methods from access publicly
    // -> not allowing outside access
    private int doors;
    private int wheels;
    private String model;// strings are actually "special classes"
    private String engine;
    private String colour;

    // create method;
    //setter
    public void setModel(String model){
        // this : when refering to the field of the class
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }
    //getter
    public String getModel(){
        return this.model;
    }

}
