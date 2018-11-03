class Bird extends Animal {
    private String song;
    private boolean canSwim;
    private boolean canFly;
    private String neighbors;

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
    Bird(String birdName, String song, Boolean canSwim,Boolean canFly,String neighbors){
        this(birdName,song,canSwim,canFly);
        this.neighbors = neighbors;
    }
    Bird(String birdName, Boolean canFly){
        this(birdName);
        this.canFly = canFly == null ? false : canFly;
    }
    Boolean hasneighbors(){
        return neighbors == null? false:true;
    }
    String sing() {
        return song == null ? String.format("%s can't sing.", getAnimalName())
                :hasneighbors() ? String.format("%s living with %s says: %s", getAnimalName(),neighbors, song)
                : String.format("%s says: %s", getAnimalName(),song);
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
        }else if ("Rooster".equalsIgnoreCase(birdName)){
            return new Bird(birdName, "Cook-a-doodle-doo", false,false);
        }
        else if ("Caterpillar".equalsIgnoreCase(birdName)){
            return new Bird(birdName, false);
        }
        else if ("Butterfly".equalsIgnoreCase(birdName)){
            return new Bird(birdName, true);
        }
        return null;
    }
    public static Bird getBirdWithneighbors(String birdName, String neighbors){
        if (birdName == null){
            return null;
        }
        if (birdName != null && neighbors == null){
            return getBird(birdName);
        }
        if ("Parrot".equalsIgnoreCase(birdName)){
            String says= "";
            if ("Dogs".equalsIgnoreCase(neighbors)){
                return new Bird(birdName,"Woof-Woof",false,true,neighbors);
            } else if ("Cats".equalsIgnoreCase(neighbors)){
                return new Bird(birdName,"Meow",false,true,neighbors);
            }else if ("Rooster".equalsIgnoreCase(neighbors)){
                return new Bird(birdName,"Cook-a-doodle-do",false,true,neighbors);
            }
            return new Bird(birdName, says);
        }
        return null;
    }
}