//Author Name: Adam Shafer
//Date: 5/17/2018
//Program Name: Shafer_Drone
//Purpose: Simulation using button, drone movement in x, y,z location


public class Shafer_Drone
{

     int x;   //  drones location x coordinate 
     int y;  //   drones location y coordinate 
     int z;  //  drones location z coordinate
     int [ ] position = new int [ 3 ];

    
   public Shafer_Drone()  // Default constructor that constructs a drone with initial position x = 0 ,  y = 0, and z = 0.
   {
	   
   }
    
     
    public Shafer_Drone( int x , int y, int z)	// Constructs a drone with the specified initial position
    {
         this.x = x;
         this.y = y;
         this.z = z;
     }


     public void up ()		// moves the drone one unit up (assuming the positive z-axis is up)
     {
          z++;
     }


     public void down ()
     {
          z--;
     }


     public void forward()	// moves the drone one unit forward (assuming the positive y-axis is forward)
     {
          y++;
     }


     public void backward()
     {
          --y;
     }


     public void turnLeft ()  
     {
          x--;
     }


     public void turnRight ()  // moves the drone one unit right (assuming the positive x-axis is right)
     {
          x++;
     }


     public int[ ] getPosition ()	// returns an array of the x,y and z coordinates of the position of the drone.  
     {
          position[ 0 ] = x;
          position[ 1 ] = y;
          position[ 2 ] = z;
       
          return position;
     }


}