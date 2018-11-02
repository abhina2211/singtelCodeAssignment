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
       }
}