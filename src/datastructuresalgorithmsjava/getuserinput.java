public void getUserInput(){
String input;
do{
input=getInputString();
handleInput(input);
} while(input.length()>0);
}
