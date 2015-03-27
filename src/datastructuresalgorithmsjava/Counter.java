public class Counter{
protected int count; //a simple integer instance variable
/*The default constructor for a counter object*/
Counter(){count=0;}
/*An accessor method to get the counter count*/
public int getCount(){
return count;}
/*A modifier method for incrementing the count*/
public void incrementCount(){count++;}
/*A modifier method for decrementing the count*/
public void decrementCount(){
count--;}
}
