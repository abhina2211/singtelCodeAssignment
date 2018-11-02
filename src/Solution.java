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
       }
}