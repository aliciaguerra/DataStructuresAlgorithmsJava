/*
arithmetic progression
*/
class ArithmeticProgression extends Progression{

/*Increment*/
protected long inc;

//inherits values first and cur

/*default constructor setting a unit increment*/
ArithProgression(){
this(1);
}

/*Parametric constructor providing the increment*/
ArithProgression(long increment){
inc increment;
}

/*
Advances this progression by adding the increment to the current value.
*/
protected long nextValue(){
cur += inc;
return cur;
}

//Inherits the methods firstValue() and printProgression(int)
}
