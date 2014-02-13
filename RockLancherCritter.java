import info.gridworld.actor.Actor; 
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Critter; 
import info.gridworld.grid.Location; 
 
import java.util.ArrayList; 
 
public class RockLancherCritter extends Critter { 
	public void act()
    {
        if (getGrid() == null)
            return;
       
        ArrayList<Actor> actors = getActors();
        ArrayList<Location> targLocs = getTargetLocations();
        Location targetLoc = selectTargetLocation(targLocs);
        processActors(targetLoc, actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }
    public ArrayList<Location> getTargetLocations(){
        return getGrid().getOccupiedLocations();
    }
  public void processActors(Location targLoc, ArrayList<Actor> actors){
     for (Actor a: actors){
     	if (a instanceof Rock){
            a.moveTo(targLoc);
        } 
     	if (a instanceof Flower) {
            if (!(a.getLocation()==null)) {
                a.removeSelfFromGrid();
            }
         }
     }
  }
  public Location selectTargetLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }
}