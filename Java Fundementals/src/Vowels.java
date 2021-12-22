import java.util.*;
public class Vowels {
	
	private static int vowelWeight(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int sum = 0;
		
		map.put('a', 1);
		map.put('e', 2);
		map.put('i', 3);
		map.put('o', 4);
		map.put('u', 5);
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for ( Map.Entry<Character, Integer> entry : map.entrySet()) {
			    Character vowel = entry.getKey();
			    int weight = entry.getValue();
			    
			    if(vowel == c) {
			    	sum += weight;
			    }
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		String s = "Welcome to Indonesia";
		
		System.out.println(vowelWeight(s));
		
	}

}
