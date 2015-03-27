public class Gnome{

//instance variables
public String name;
public int age;
public Gnome gnomebuddy;
private boolean magical = false;
protected double height=2.6;
public static final int MAX_HEIGHT=3;//maximum height

//Constructors
Gnome(String nm, int ag, Gnome bud, double hgt){//fully parameterized
name=nm;
age=ag;
gnomeBuddy=bud;
height=hgt;
}

Gnome() {//Default constructor
name="Rumple";
age=204;
gnomeBuddy=null;
height=2.1;
}

//Methods
public static void makeMeKing(Gnome h){
h.name="King"+h.getRealName();
h.magical=true;//Only the gnome class can reference this field.
}

public void makeMeKing(){
name="King"+getRealName();
magical=true;
}
public boolean isMagical(){return magical;}
public void setHeight(int newHeight) {height=newHeight;}
public String getName() {return "I won't tell!";}
public String getRealName(){return name;}
public void renameGnome(String s){name=s;}
}
