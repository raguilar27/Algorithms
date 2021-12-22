import java.util.*;

public class LeetCode {
	
	private static boolean unique(String s) {
		if(s.length() > 128) return false;
		// Using hashSet takes more space
		// Set<Character> set = new HashSet<>();
		int checker = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if((checker & (1 << c)) > 0) {
				return false;
			}
			checker |= (1 << c);
		}
		
		return true;
	}
	
	private static boolean permutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		char[] check = new char[128];
		char[] s1_arr = new char[128];
		
		for(char c : s1_arr) {
			check[c]++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			int c = s2.charAt(i);
			check[i]--;
			if(check[i] < 0)
				return false;
		}
		
		return true;
	}
	
	private static char[] URLify(char[] s, int n) {		
		// replaces spaces with %20 for each space in string
		int spaces = 0;
		for(int i = 0; i < n; i++) {
			if(s[i] == ' ') { 
				spaces++;
			}
		}
		
		int index = n + spaces*2;
		if(n < s.length) s[n] = '\0'; // End array
		
		for(int i = n-1; i >= 0; i--) {
			if(s[i] == ' ') {
				s[index-1] = '0';
				s[index-2] = '2';
				s[index-3] = '%';
				index = index - 3;
			}else {
				s[index-1] = s[i];
				index--;
			}
		}
		return s;
	}
	
	/// Method helps palindromePermutation
	/* Map each character to a number. a -> 0, b -> 1, c -> 2, etc. 
	 * This is case insensitive. Non-letter characters map to -1. */
	private static int getCharNumber(Character c) { 
		int a = Character.getNumericValue('a'); 
	 	int z = Character.getNumericValue('z'); 
	 	int val = Character.getNumericValue(c); 
	 	if (a <= val && val <= z) { 
		 	return val - a; 
	 	} 
	 	return -1; 
	}
	
	private static boolean palindromePermutation(String s) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - 
		                      Character.getNumericValue('a') + 1];
		
		for(char c : s.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
				if(table[x] % 2 == 1) {
					countOdd++;
				}else {
					countOdd--;
				}
			}
		}
		
		return countOdd <= 1;
	}
	
	private static boolean oneAway(String s1, String s2) {
		if(s1.length() < s2.length()) return oneAway(s2, s1);
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}	
		
		int edits = 0;
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c)) {
				edits++;
			}else {
				map.put(c, map.get(c)-1);
			}
		}
		
		for(int count : map.values()) {
			if(count == 1 || count < 0) {
				edits++;
			}
		}
		
		return edits <= 1;
	}
	
	public static class TreeNode {
		String val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(String val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		};
	}
	
	public static String csv(String s) {
		String[] rows = s.split("\n");
		
		for(int i = 1; i < rows.length; i++) {
			String[] cols = rows[i].split(",");
			
			// Head is set to the id 
			TreeNode head = new TreeNode(cols[0], null, null);
			TreeNode curr = head;
			
			int j = 0;
			while(curr != null && j < cols.length) {
				curr.left = new TreeNode(cols[j], null, null);
				curr = curr.left;
				//System.out.print(curr.val + " | ");
				j++;
			}
			
			String tempList = head.left.left.val;
			
			String[] list = tempList.split(">");
			TreeNode listHead = new TreeNode(list[0], null, null);
			TreeNode currList = listHead;
			
			int k = 1;
			while(currList != null && k < list.length) {
				curr.right = new TreeNode(list[k], null, null);
				curr = curr.right;
				//System.out.print(curr.val + " | ");
				k++;
			}
			
			head.left.left = listHead;
			
			System.out.print(head.left.left.val);
			
			System.out.println();
		}
//		String param = "id,list,item,storage,price\n" 
//				+ "100,Bucket>Soap>Brush>Sponge,Mop,Garage,0.42\n" 
//				+ "101,Fridge>Cheese>Ham>Milk,Bottle,House,1.22\n"
//				+ "102,Room>Fountain>Bar>Dumbell,Bench,Gym,0.75\n";
		
		return s;
	}
	
	public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }

        while(!pq.isEmpty())
            result.add(0, pq.poll().getKey());
        
        return result;
    }
	
	public static List<List<Integer>> getPermutations(List<Integer> array) {
	    List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutations(0, array, permutations);
		return permutations;
    }
	
	public static void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations) {
		if(i == array.size()-1) {
			permutations.add(new ArrayList<Integer>(array));
		}else {
			for(int j = i; j < array.size(); j++) {
				swap(i, j, array);
				getPermutations(i+1, array, permutations);
				swap(i, j, array);
			}
		}
	}
	
	public static void swap(int i, int j, List<Integer> array) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
	
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		
		System.out.println(getPermutations(array));
	}

}
