package JavaAssignmentQ4;

public class mocktest {
	public void moveZeroes(int[] nums) {
	    int n = nums.length;
	    int i = 0; // Slow pointer
	    
	    // Iterate through the array
	    for (int j = 0; j < n; j++) {
	        if (nums[j] != 0) {
	            // Swap non-zero element to the slow pointer position
	            int temp = nums[i];
	            nums[i] = nums[j];
	            nums[j] = temp;
	            i++;
	        }
	    }
	}


}
