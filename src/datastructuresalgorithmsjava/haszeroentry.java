public static boolean hasZeroEntry(int[][] a) {
boolean foundFlag=false;

zeroSearch:
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(a[i][j]==0){
foundFlag=true;
break zeroSearch;
}
}
}
return foundFlag;
}
