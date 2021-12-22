import java.util.*;
public class sumList {
	
	public static void main(String[] args) {
		
		int sum = 0;
        List<String> list = new ArrayList<>();
        
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
        
        for (String s : list) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException ex) {
            	//System.out.println(ex);
            }
        }

        System.out.println(sum);
	}

}
