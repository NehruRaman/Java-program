package array;
import java.util.Scanner;
public class Maximum {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum na = new Maximum ();
		na.max();
		na.min();
	}
	static int[] scanner() {
		 Scanner na = new Scanner(System.in);
	     System.out.println("enter Size of Array");
	     int size = na.nextInt();  
	     int [] array = new int[size];
	     System.out.println("enter the elements");
	     for(int i = 0;i<array.length;i++) {
	    	 array[i] = na.nextInt();
	    	 
	     }return array;
	}
   void max() {
	   int array[] = scanner();
	   int max = Integer.MIN_VALUE;
	   for(int i =0;i<array.length;i++) {
		   if(array[i]>max) {
			   max = array[i];
			   
			   }
	   }
	   System.out.println("maximum element in array:"+max);
   }
   void min() {
	   int array[] = scanner();
	   int min = Integer.MAX_VALUE;
	   for(int i =0;i<array.length;i++) {
		   if(array[i] < min) {
			   min = array[i];
			   
			   }
	   }
	   System.out.println("maximum element in array:"+min);
   }
}
