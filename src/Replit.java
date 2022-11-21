import java.util.Arrays;
import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
	    
		Scanner scan = new Scanner(System.in);
	    
		int size = scan.nextInt();
	   
		int[] nums = new int[size];
		
			for(int i = 0; i < size; i++) 
			{
				nums[i] = scan.nextInt();
				
			}
			
			
	      int newSize = size * 2;
	       
		int[] nums2 = new int [newSize];

		for(int a = 0; a < newSize-2; a++)
		{
			nums2[a] = 0;
		}

	   nums2[newSize-1] = nums[size-1];
	   
	   
	   
	  for (int x = 0 ; x < newSize; x++) {
    	
              System.out.println(nums2[x]);
      }
			
			
	  }
		
		
		
}
	

	


