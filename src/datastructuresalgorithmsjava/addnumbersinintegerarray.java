/*Adds all the numbers in an integer array*/
public static int sum(int[] a){
int total=0;
for(int i=0;i<a.length;i++)//note the use of the length variable
total +=a[i];
return total;
}
