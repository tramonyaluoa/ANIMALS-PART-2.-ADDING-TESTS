class Dog extends Animal {

    private String eats;
    private String sounds;
    String string = "";

    public Dog(String sounds, String eats){
        this.sounds = sounds;
        this.eats = eats;


    }



    public String dog(){
        return string = "The Dog " + sounds + "\n" +"The Dog eat " + eats;
    }
}
