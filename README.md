This week's practical exercises aim to get you familiar with Java and IntelliJ IDEA via basic programming exercises.

# Hello World!

Open `HelloWorld.java` and modify the code such that the program prints "Hello World!" when run.

Note that, as this project was originally configured for JDK 1.8, you will get a message up the top asking if you want to download JDK 1.8. There is no need for this! Just click the 'Configure...' link on the right of that message and select JDK 17, which is the Amazon Corretto you configured. Now the project should compile and run.

# Debugging a summation program

This exercise will give you practice using IDEA's debugger. Open `Summation.java`. This program is meant to calculate the sum of the natural numbers in a given range. The range is expressed by constants for the starting and finishing numbers, inclusive. Recall, for instance that the sum of `i` over 1<=`i`<=5 is 15.

**(a)** Run the program with a `START` value of 1 and an `END` value of 5. Is the answer what you expected? In the `add()` method click in the grey bar just to the left of the __`for`__ loop statement (in the space between the line numbers and the code). This adds a _breakpoint_ to the application. Now 'debug' rather than 'run' the program. You will be able to control the program's execution using the various debugging buttons ![various debugging icons](imgs/debugbtns.png "various debugging icons"). Step through the program and watch how variables `index` and `total` change. By doing this you should be able to spot and fix the coding error.

**Note:** If you hover the cursor over a variable when the program is stopped the variable's value is displayed.

**(b)** Having corrected the error in the program, now change the value of constant `END` to 1000. Run the program. Does the answer look correct? Debug the program again and see if you can identify and fix this new problem. (This may require some patience!)

# Footy Score

*Note that the FootyScore package has been excluded by default in the Git repository, to avoid this causing compilation to fail when you are completing the other exercises. Once you've implemented a working FootyScore class, right-click on the footyScore package in the project view, click 'Mark Directory as' -> 'Cancel Exclusion' to fix this.*

This exercise will give you experience at developing a simple (concrete) _class_ in Java. In Australian Rules Football, teams earns _points_ by kicking _goals_, worth six points each, and _behinds_, worth one point each. Your job is to create `FootyScore.java` which keeps track of the score earned by a particular team. This class needs to:

* declare a private data structure sufficient to keep track of the team's score;
* declare a parameterless public method called `getPoints` that returns the team's total score in points;
* declare a parameterless public method called `kickGoal` that records the fact that the team has kicked a goal;
* declare a parameterless public method called `kickBehind` that records the fact that the team has kicked a behind;
* declare a parameterless public method called `sayScore` that returns a character string representing the way Australian Football League commentators traditionally say AFL scores, as three numbers, consisting of the number of goals kicked, the number of behinds kicked, and the total number of points earned, in that order; and
* declare a predicate (boolean-valued function) called `inFrontOf` which accepts a `FootyScore` object as its parameter and returns true if and only if (iff) this team's score exceeds that of the team provided as an argument.

To help you assess your solution the file `FootyTester.java` contains a 'main' program that simulates a (rather low scoring) AFL match between traditional rivals
Collingwood and Richmond. It prints the breathless commentary of a typically rabid AFL announcer. If your solution works correctly, the test program will print the following
commentary on the console. Note that your `sayScore` method should return the three numbers separated by a comma and a space.

    At the end of the first quarter, it's Collingwood, 0, 2, 2 and Richmond 1, 0, 6.
    Richmond lead by 4 points!
    At the end of the second quarter, it's Collingwood, 2, 3, 15 and Richmond 3, 0, 18.
    Richmond lead by 3 points!
    At the end of the third quarter, it's Collingwood, 3, 3, 21 and Richmond 3, 2, 20.
    Collingwood lead by 1 point!

(We leave the final score in doubt to avoid offending any Collingwood or Richmond
supporters in the class.)

# Shapes

This exercise will give you experience in polymorphism.

You are provided with the `Shape` interface. Create three implementations of `Shape`, implementing the volume and surface area methods required by the interface as follows:

## `Tetrahedron(double edge)`

![](imgs/tetrahedron_vol.png)

![](imgs/tetrahedron_sa.png)


## `Cylinder(double radius, double height)`

![](imgs/cylinder_vol.png)

![](imgs/cylinder_sa.png)


## `Cube(double edge)`

![](imgs/cube_vol.png)

![](imgs/cube_sa.png)



You can verify your classes work by constructing objects from them and checking that `volume` and `surfaceArea` return the correct results.

Your second task is to use polymorphism to complete the two methods in the `ShapeHandler` class:

```java
package shapes;

public class ShapeHandler {

    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        return 0;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        return 0;
    }

}
```

You can test that you have implemented `ShapeHandler` correctly by constructing an array of various shapes and passing them to your `ShapeHandler` methods.


**Question**:  Why do we make the Shape methods non-static but the ShapeHandler methods static?


# A superhero class hierarchy

This exercise will give you experience at interpreting Application Programming Interface documentation and developing non-trivial class hierarchies, including a Java _interface_, _abstract class_ and _concrete classes_.

Comic book superheroes remain in vogue thanks to the financial success of the recent Marvel movies. In this exercise you will develop a type hierarchy that models the characteristics of comic book superheroes. (But for testing purposes we will use 'Golden Age' superheroes from the 1940s and 1950s since these were when superheroes peaked.)

Enclosed with these instructions you will find the API documentation for a 'superhero' class hierarchy, along with two Java files:

* Enumerated type `SuperPower.java` which lists the superpowers available to
  Golden Age superheroes.
*  A 'main' program `HeroTester.java` which will work fully only when you have completed the exercise. You will probably want to comment out some of the tests during code development. We suggest you begin with just the tests related to mortal superheroes uncommented. Once you have got this class working, uncomment some of the other tests.

Included in this documentation is the role of each class and the intended purpose of its members, as well as brief hints about intended usage.

Your task is to study the API documentation and, based on this, to implement the missing classes, `Hero.java`, `SuperHero.java`, `Human.java`, `EnhancedHuman.java` and `SuperHuman.java`. These classes form a hierarchy as shown overleaf. Make sure you read _all_ the API documentation and clearly understand how the various classes and their methods relate to one another _before_ you start writing code. Also, try to make good use of IntelliJ's "intention action" features to help you develop the code quickly. For instance, when creating a subclass you can get IntelliJ to automatically declare all the inherited methods that must be implemented. Remember that you can use Alt+Enter or click on the red or yellow light bulb to access intention actions.

**Hint**: For one of the above classes you will can implement the powers as an array. For another one of the classes you will need to need to implement the powers as a Set, implemented as a HashSet. The code to declare a HashSet is
`HashSet<T> set=new HashSet<T>();`,
where  `T` is the name of the class stored in the Set. We will learn about Set/HashSet and other Java collections in week 4. You can find out more about the HashSet class, including with methods will be most useful, either via the Java API documentation or by using IntelliJ's inline help (hint: use Ctrl+Q to view the documentation for a method or class). Also, as powers are passed as an array you will need to find a way to convert them to a HashSet.


![Hero class hierarchy](imgs/hero.jpg "Hero class hierarchy")

(**Comment for nitpickers**: The particular choices of superpowers used in test program `HeroTester.java` are somewhat debatable. For instance, Captain Marvel is usually described as 'swift as Mercury' but we have not given him the power of 'super speed' because he seems to be nowhere near as fast as characters who specialise in speed, such as The Flash. Similarly, we have not ascribed the power of flight to Wonder Woman because in her Golden Age incarnation she needed her invisible plane to fly. More recently, however, she has acquired the ability to 'ride the winds' as if flying. In summary, the superpowers used in `HeroTester.java` are for illustrative purposes only. No correspondence will be entered into.)

**Question**:  Why was Hero an declared as an interface? Why was SuperHero declared as an abstract Class. Could/Should we have declared Hero as an abstract class or SuperHero as an interface? Why or why not?


## Adding secret agents as heroes

So far the `Hero` interface doesn't appear to be especially helpful. However, it serves an important purpose because it gives us flexibility in extending the type hierarchy. For instance, we can add a (concrete) `SecretAgent` class below it, without affecting the superhero classes in any way.

![Hero class heirarchy extended with SecretAgent](imgs/agent.jpg "Hero class heirarchy extended with SecretAgent")

Not only do secret agents have an alias (when on a mission James Bond is known as '007' and Maxwell Smart as 'Agent 86'), but they are frequently associated with gadgets (like Max's shoephone). Therefore, your `SecretAgent` class should inherit the features of the `Hero` class and add an attribute which stores the gadget typically associated with this agent (as a text string). Once again, consult the API documentation provided for the precise specification. Use the `AgentTester.java` program to test your class.

**Question:**  Do you need to declare a method for returning a secret agent powers? Why or why not?
