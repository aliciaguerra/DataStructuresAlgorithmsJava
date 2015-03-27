/*
This class defines an immutable (x,y) point in the plane.
*/
public class XYPoint {
private double x,y; //private instance variables of the coordinates

/*
Construct an (x,y) point at a specified location.
xCoor = the x-coordinate of the point
yCoor = the y-coordinate of the point
*/

public XYPoint(double xCoor, double yCoor){
x=xCoor;
y=yCoor;
}

/*
Return x-coordinate value
*/
public double getX(){return x;}

/*
Return y-coordinate value.
*/
public double getY() {return y;}
}
