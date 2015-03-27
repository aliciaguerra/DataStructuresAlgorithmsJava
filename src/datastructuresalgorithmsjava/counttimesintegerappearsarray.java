/*counts the number of times an integer appears in the array*/
public static int findCount(int[] a, int k){
int count=0;
for(int e:a){//not the use of for each loop
if(e==k)//check if the current element equals k
count++;
}
return count;
}
