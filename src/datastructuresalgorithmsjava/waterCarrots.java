public void waterCarrots(){
Carrot current=garden.findNextCarrot();

while(!waterCan.isEmpty()){
water(current,waterCan);
current=garden.findNextCarrot();
}
}
