package JavaAssignmentQ4;
import java.util.HashMap;
public class Mocktest2 {
	

	public int firstUniqChar(String s) {
	    // Create a hash map to store the frequency of each character
	    HashMap<Character, Integer> charFrequency = new HashMap<>();
	    
	    // Count the frequency of each character in the string
	    for (char c : s.toCharArray()) {
	        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
	    }
	    
	    // Iterate through the string and find the first non-repeating character
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (charFrequency.get(c) == 1) {
	            return i;
	        }
	    }
	    
	    // No non-repeating character found
	    return -1;
	}


}
