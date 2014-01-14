Set 2
	1. What is the role of the instance varable sideLength?
	
	To store the length of the side in the movement of a bug.
	
	2. What is the role of the instance varable steps?
	
	Steps is a counter for the number of steps of the bug.
	
	3. Why is the turn method called twice when steps be come equal to sideLength? 

	To turn at a 90 degree angle and countiune the bug in a square shape.
	
	4.Why can the move be called in the BoxBug class when there is no move method in the box bug code?
	
	BoxBug is an extention of the class bug so all methods in bug can be called in BoxBug.
	
	5. After a BoxBug is constructed, will the size of the square pattern always be the same? Why or Why not? 

	This depends upon the objects in the path of the bug if a rock is in the way once the next time not then the size of the square would change.
	
	6. Can the path a BoxBug travle ever change? Why or why not?
	
	The path of the bug can change due to obstacles in the bugs way like rocks and limits of the grid
	
	7. When will the value of the steps be zero 
	
	When the program starts. And when the Bug turnes the counter of steps is set to zerp
	
	1. Write a class CircleBug that is identical to BoxBug, execept that in the act method the turn method is called once instead of twice. How is its behavior differen from a BoxBug? 

	It turns at a 45 degeree angle and makes a hexagon.
	
	2.			import info.gridworld.actor.Bug;
			public class CircleBug extends Bug {
			   private int steps;
		    private int sideLength;

		    /**
		     * Constructs a box bug that traces a square of a given side length
		     * @param length the side length
		     */
		    public CircleBug(int length)
		    {
		        steps = 0;
		        sideLength = length;
		    }
		   
		      /**
		     * Moves to the next location of the square.
		     */
		    public void act()
		    {
		        if (steps < sideLength && canMove())
		        {
		            move();
		            steps++;
		        }
		        else
		        {
		            turn();
		            steps = 0;
		        }
		    }
		}

	3.		import info.gridworld.actor.Bug;
		public class SpiralBug extends Bug{
			   private int steps;
		    private int sideLength;

		    /**
		     * Constructs a box bug that traces a square of a given side length
		     * @param length the side length
		     */
		    public SpiralBug(int length)
		    {
		        steps = 0;
		        sideLength = length;
		    }
		   
		      /**
		     * Moves to the next location of the square.
		     */
		    public void act()
		    {
		        if (steps < sideLength && canMove())
		        {
		            move();
		            steps++;
		        }    
		        else
		        {
		            turn();
		            turn();
		            sideLength = sideLength + 1;
		            steps = 0;
		        }
		    }
		}
		Spiral Bug runner



import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;


public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(2);
        alice.setColor(Color.ORANGE);
        // BoxBug bob = new BoxBug(3);
        world.add(new Location(5, 5), alice);
        // world.add(new Location(5, 5), bob);
        world.show();
    }
}
	4. ZBug
			import info.gridworld.actor.Bug;

		public class ZBug extends Bug
		{
		private int sideLength; 
		private int steps; 
		private int sideNo; 
		public ZBug(int length)
		{
		setDirection(90); //East
		steps = 0;
		sideNo = 1;
		sideLength = length;
		}
		public void act()
		{
		if (sideNo <= 3 && steps < sideLength)
		{
		  if (steps == 0)
		  {
		    if (sideNo == 2) 
		    {
		      setDirection(225);
		    }
		    else {
		      setDirection(90);
		    }
		  }
		  if (canMove())
		  {
		    move();
		    steps++;
		  }
		}
		else if (steps>= sideLength) 
		  { //steps = partLength so switch direction
		    steps = 0;
		    sideNo++; //increase sideNo
		  }
		}
		} 
		ZBug Runner
		import info.gridworld.actor.ActorWorld;
		import info.gridworld.grid.Location;

		public class ZBugRunner
		{
		public static void main(String[] args)
		{
		ActorWorld world = new ActorWorld();
		ZBug fred = new ZBug(4);
		world.add(new Location(3,2),fred);
		world.show();
		}
		}
	5. a. create another bug with a side length 
			BoxBug "Bug Name Here" = new BoxBug(length);
		b. add a location for the bug on the grid
			world.add("Bug Name Here");
			or 
			world.add(new Location(1,1),"Bug Name Here");