package lab_2;

//Remove the duplicate elements in the array and sort it in descending order 
import java.util.Arrays;

class Exercise4 {
 int[] modifyArray(int[] arr){
 Arrays.sort(arr);
 int[] tempArr = new int[arr.length];

 int j = 0;

 for(int i = 0; i < arr.length -1; i++){
   int currentElement = arr[i];

   if (currentElement != arr[i + 1]){
     tempArr[j++] = currentElement;
   }
 }
 tempArr[j++] = arr[arr.length - 1];

 int x = 0;

 for(int i=0; i<arr.length; i++){
   if(tempArr[i]!=0){
     x++;
   }
 }

 int tempArr2[] = new int[x];

 for(int i = 0; i<x; i++){
   tempArr2[i] =  tempArr[x-i-1];
 }

 return tempArr2;
 }


 public static void main(String[] args){
   int[] array = {100, 23, 57, 100, 35, 44, 23};
   Exercise4 ex4 = new Exercise4();

   System.out.println(Arrays.toString(ex4.modifyArray(array)));

 }

}