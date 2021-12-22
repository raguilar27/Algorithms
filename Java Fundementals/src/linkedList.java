import java.util.*; 

public class linkedList{

    public static void main(String[] args) {
        LinkedList<String> sentence = new LinkedList<>();

        sentence.add("Hello");
        sentence.add("World");
        sentence.add(1, " ");
        System.out.println("Initial LinkedList " + sentence);

        sentence.set(1, "cruel");
        System.out.println("Set LinkedList " + sentence);

        sentence.remove(1);
        System.out.println("Removed node from LinkedList " + sentence);

        sentence.add(1, "cruel");

        //normal for loop
        for (int i = 0; i < sentence.size(); i++){
            System.out.print(sentence.get(i) + " ");
        }
        System.out.println();
        //for each loop
        for (String str : sentence) {
            System.out.print(str + " ");
        }
        System.out.println();

        
    }

}