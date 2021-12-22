import java.util.*;

public class VowelsRecursion {
	
	private static int vowelWeight(String s, int sum, int index) {
		
		if(index == s.length()) {
			return sum;
		}
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 1);
		map.put('e', 2);
		map.put('i', 3);
		map.put('o', 4);
		map.put('u', 5);
		
		char c = s.charAt(index);
		for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
		    Character vowel = entry.getKey();
		    int weight = entry.getValue();
		    
		    if(vowel == c) {
		    	sum += weight;
		    }
		}
		
		index++;
		
		return vowelWeight(s, sum, index);
	}

	public static void main(String[] args) {
		String s = "Welcome to Indonesia";
		
		System.out.println(vowelWeight(s, 0, 0));
		
	}

}
