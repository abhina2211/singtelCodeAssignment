class Bird extends Animal {
    private String song;
    private Boolean canSwim;
    private Boolean canFly;

    Bird(String birdName){
        super(birdName);
    }
    Bird(String birdName, String song) {
        this(birdName);
        this.song = song;
    }
    Bird(String birdName, String song, Boolean canSwim,Boolean canFly){
        this(birdName,song);
        this.canSwim = canSwim == null ? false : canSwim;
        this.canFly = canFly == null ? false : canFly;
    }
    String sing() {
        return String.format("%s says: %s", getAnimalName(),song);
    }
    String swim() {
        return canSwim ? String.format("%s can swim.", getAnimalName()) : String.format("%s can't swim.", getAnimalName());
    }
    String fly() {
        return canFly ? String.format("%s can fly.", getAnimalName()) : String.format("%s can't fly.", getAnimalName());
    }
}

class BirdFactory {

    public static Bird getBird(String birdName){
        if(birdName == null){
            return null;
        }
        if ("Duck".equalsIgnoreCase(birdName)){
            return new Bird(birdName, "Quack Quack", true,true);
        } else if ("Chicken".equalsIgnoreCase(birdName)){
            return new Bird(birdName, "Cluck Cluck", false,false);
        }
        return null;
    }
}