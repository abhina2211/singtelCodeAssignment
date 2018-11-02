# singtelCodeAssignment
Code assignment for java developers

Problem A.1 - Similar to the fly() method we can define the sing() method in Bird class 1.b - To optimize the code for maintainability we can take out the Animal and Bird class from the main Solution.java and create separate files for these. Source folder would look like

Solution.java Animal.java Bird.java

Problem A.2 - implementing the Duck and Chicken as a special kind if bird and assign them there own sound.

Change the structure of the code to implement Factory pattern and accessor/mutator to retrieve and update animalName.
created a method getBird in BirdFactory class to assign the sound and behavior of the bird based on whether it is a Duck or Chicken.
Since the code should be able to handle different type of birds I have restructured the code to make use of Factory Patterns.

By using this pattern we can not only make the code maintainable but also scalable.I have also used the accessor and mutator to retrieve and update animalName.

Problem A.3 - implementing the Rooster

1. to implement the Rooster we have modified the getBird method in BirdFactory class to check if the bird name is passed as Rooster we will override the song method to say Cook-a-doodle-doo.
	Another change would be instantiate an object of the Bird class with birdName as Rooster.

