public class Solution {

    public static void main(String[] args){
        Bird duck = BirdFactory.getBird("Duck");
        System.out.println(duck.walk());
        System.out.println(duck.fly());
        System.out.println(duck.sing());
        System.out.println(duck.swim());
        System.out.println("--------------------------");
        Bird chicken = BirdFactory.getBird("Chicken");
        System.out.println(chicken.walk());
        System.out.println(chicken.fly());
        System.out.println(chicken.sing());
        System.out.println(chicken.swim());
        System.out.println("--------------------------");
        Bird rooster = BirdFactory.getBird("Rooster");
        System.out.println(rooster.walk());
        System.out.println(rooster.fly());
        System.out.println(rooster.sing());
        System.out.println(rooster.swim());
        System.out.println("--------------------------");
        Bird parrotWithDogs = BirdFactory.getBirdWithneighbors("Parrot","Dogs");
        System.out.println(parrotWithDogs.walk());
        System.out.println(parrotWithDogs.fly());
        System.out.println(parrotWithDogs.sing());
        System.out.println(parrotWithDogs.swim());
        System.out.println("--------------------------");
        Bird parrotWithCats = BirdFactory.getBirdWithneighbors("Parrot","Cats");
        System.out.println(parrotWithCats.walk());
        System.out.println(parrotWithCats.fly());
        System.out.println(parrotWithCats.sing());
        System.out.println(parrotWithCats.swim());
        System.out.println("--------------------------");
        Bird parrotWithRooster = BirdFactory.getBirdWithneighbors("Parrot","Rooster");
        System.out.println(parrotWithRooster.walk());
        System.out.println(parrotWithRooster.fly());
        System.out.println(parrotWithRooster.sing());
        System.out.println(parrotWithRooster.swim());
       }
}