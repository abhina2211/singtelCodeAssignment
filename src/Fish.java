class Fish extends Animal {
    private boolean canSwim;
    private String action;
    private String size;
    private String color;
    Fish(String fishName){
        super(fishName);
    }
    Fish(String fishName, Boolean canSwim) {
        this(fishName);
        this.canSwim = canSwim == null ? false : canSwim;
    }
    Fish(String fishName, Boolean canSwim,String action,String color,String size){
        this(fishName,canSwim);
        this.action = action;
        this.color = color;
        this.size = size;
    }

    String specialize() {
        return String.format("%s  %s", getAnimalName(),action);
    }
    String swim() {
        return canSwim ? String.format("%s can swim.", getAnimalName()) : String.format("%s can't swim.", getAnimalName());
    }
    String size() {
        return String.format("%s is %s", getAnimalName(),size);
    }
    String color() {
        return String.format("%s is of %s color", getAnimalName(),color);
    }

}

class FishFactory {

    public static Fish getFish(String fishName){
        if(fishName == null){
            return null;
        }
        if ("Shark".equalsIgnoreCase(fishName)){
            return new Fish(fishName,true,"eat other fish","grey","large");
        } else if ("ClownFish".equalsIgnoreCase(fishName)){
            return new Fish(fishName,true,"make jokes","orange","small");
        }else if ("Dolphin".equalsIgnoreCase(fishName)){
            return new Fish(fishName, true);
        }
        return null;
    }

}