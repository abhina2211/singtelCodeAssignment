class Animal{
    private String animalName;
    Animal(String animalName){
        this.animalName = animalName;
    }
    protected String getAnimalName() {
        return animalName;
    }
    protected void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    String walk(){
        return String.format("%s can walk.", animalName);
    }
}