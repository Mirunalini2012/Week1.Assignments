package week1.day1.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,9};
		Arrays.sort(arr);
		for(int i=arr[0]; i<=arr.length; i++) 
		{
			//System.out.println("i value" +i);
			//System.out.println("array value" +arr[i]);
			//System.out.println(i+1);
			if(i+1!=arr[i])
			{
			System.out.println(i+1);
				break;				
			}
			
			
       	}

}
	
}
