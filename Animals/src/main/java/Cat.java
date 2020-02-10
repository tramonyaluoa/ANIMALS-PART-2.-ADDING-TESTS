class Cat extends Animal {


    private String eats;
    private String sounds;
    String string = "";

    public Cat(String sounds, String eats){
        this.sounds = sounds;
        this.eats = eats;
    }



    public String cat(){
        return string = "The Cat " + sounds + "\n" +"The Cat eat " + eats;}


}
