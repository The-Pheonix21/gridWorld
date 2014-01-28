Set 7
1. What methods are implimented in Critter?
	act
	getActors
	processActors
	getMoveLocations
	selectMoveLocations
	makeMove

2.What are the five basic actions common to all criters when they act?
	getActors
	processActors
	getMoveLocations 
	selectMoveLocations
	makeMove

3.Should subclasses of critters override the getActors method Explane

The subclasses of critters shoud overide the get actor method if that subclass is going to implement some behavior other than the Critter class default behavior.

4.Describe three ways that a critter could processs actors.

	1.Avoid the actor-turn and jump awasy 
	2.Land on the actor
	3.Change the color of the actor

5.What three methods must be invoked to make a critter move? Explane each of these methods
	getMoveLocations, selectMoveLocation, makeMove

6.Why is there no Critter constructor.

Because critter has a runner it doesn't need a constructor

Set 8

1. Why does act cause a ChameleonCritter to act differently from a Critter even though ChameleonCritter does not override act? In the class Actor there is a method setColor which the class Critter which uses this class only for Chameleon.

2.Why does the makeMove method of ChameleonCritter call super.makeMove? To overide the move method so the chameleon can move in its own way. Specificly it makes the chameleon face the direction of its new direction and then the super.makeMove moves the critter to the new location.

3.How would you make the ChameleonCritter drop flower in tis old location when it moves?
 Make a temp varable to store its last location then it would put a flower in its last location. It would need the grid loc and the old Location to put the flower in the last location.

4.Why doesn't ChameleonCritter overide the getActors method? The Chameleon uses the same list of actors that critter does, and ChameleonCritter doesn't define a new behavior for getActors, it can still use the same method.

5. Which class contains the getLocation method?
	Actor class.

6.How can a Critter acess its own grid?
	It can call the getGrid method.(Subclass of Actor).

Set 9

1. Why doesn't CrabCritter overide the processActors method? 
The crab processes the actors by eating all of the neighbors and returns when getActors is called.This is inherited form critter.

2. Describe the process a CrabCritters uses to find and eat other actors. Does it allways eat all neighboring actors? Explain 
When the CrabCritter is run the get actor method only looks for actor infront of the crab, and on the left and right of the crab. Actors in these locations will be "eaten" and then processed by processActors.

3. Why is the getLocationsInDirections method used in Crab Critter? 
The getLocationsInDirections method is used to compile a list of actors that are infront, to the right, and to the left for the crab to move to "eat them".

4. If a CrabCritter has location (3,4) and faces south, what are the possible locations for actors that are returned by a call to the getActors method? 
(4,3) (4,4), and (4,5)

5.What are the similarities and differences between the movements of a CrabCritter and a Critter?
CrabCritter and Critter move randomly to there next location from the array of locations and then move.

It is different because the crab will only move to its right or its left.

6. How does a CrabCritter determine when it turns instead of moving? 
If loc is equual to the crabs currne locations then it turns.

 7. Why don’t the CrabCritter objects eat each other? 
In processActors the crab can't eat rocks and other critter due to the critter class.