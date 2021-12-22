import java.util.*;
public class sumListRecursion {
	
	public static int sumRec(List<String> list, int sum, int index) {
		if(index == list.size()) {
			return sum;
		}
		
		try {
			sum += Integer.parseInt(list.get(index));
		}catch(NumberFormatException ex) {
			//System.out.println(ex);
		}
		
		index++;
		return sumRec(list, sum, index);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        int index = 0;
        int sum = 0;
        
        //test cases
        list.add("sun");
        list.add("20");
        list.add("10");
        list.add("red");
        list.add("ORANGE");
        list.add("s33");
        list.add("-30");
        list.add("--100");
        list.add("?f/drfe");
        list.add("dfe334gd");
        list.add("1000*100");
        list.add("200000000");
        list.add("3+3");
        list.add("2/5");
        list.add("2-3");
        
        System.out.println(sumRec(list, 0, 0));
	}

}
