Set 1
1.       Does the bug always move to a new location?  Explain.  No, the bug seems to seek a way to create a continuous loop on the grid.  At the corners or ends f the grids, it doesn’t move to another grid immediately.  The bug moves within the location to angle itself if the correct direction first and then moves.

2.       In which direction does the bug move.  It always tries to move forward.  So initially it starts north until it reaches the edge of the grid and then it moves to the right or East, then south once it reaches the edge of the east grid.  It may move southwest if the bug encounters an object in its way like a rock.  The bug appears to want to travel along the flower (the mark it leaves when it moves from one grid block to another) when the step or run buttons are pushed.

3.       What does the bug do if it does not move?  It may reposition itself within the grid block to move another direction.

4.       What does the bug leave behind when it moves?  It leaves behind a flower.

5.       What happens when the bug is at an edge of the grid?  (Consider whether the bug is facing the edge as well as whether the bug is facing some other direction when answering the question.)  When the bug is at the edge of a grid it starts moving 45 degrees clockwise until it is facing a direction that will allow it to move directly into the next open grid space.

6.       What happens when a bug has a rock in the location immediately in front of it?  The bug moves to avoid it in a direction that will allow it to find the largest continuous loop.

7.       Does a flower move?  No the flower doesn’t move.

8.       What behavior does a flower have? The flower color changes from dark to bright as the bug places or passes through it. The flower stays bright if the bug is on the same line of the flowers.

9.       Does a rock move or have any other behavior? The rock doesn’t move with the step or run command, but can be different colors.  If you click on the rock, you an move it to another location.

10.   Can more than one actor (bug, flower, rock) be in the same location in the grid at the same time?  No.  Only one item can be in a grid space.
Exercises
1. 0 North
   45 NE
   90 East
   135 SE
   180 South
   225 SW
   270 West
   315 NW
   360 North
2.Move a bug to a different location using the moveTo method. In which directions can you move it? How far can you move it? What happens if you try to move the bug out side the grid?

3. Change the color of a bug, a flower, and a rock. Which method did you use? To change the color of a bug you change the method titled bug. For a flower change the method flower under the class flower. For rock change the method rock under the class rock.

4. Move a rock on top of a bug and then move the rock again. What happened to the bug?
The bug vanished(was squashed).
