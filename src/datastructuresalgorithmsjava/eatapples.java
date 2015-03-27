public void eatApples(Apples apples){
numApples=apples.getNumApples();
for(int x=0;x<numApples;x++){
eatApple(apples.getApple(x));
spitOutCore();
}
}
