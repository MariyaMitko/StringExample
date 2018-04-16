package by.mitsko.string;

import java.util.HashMap;
import java.util.Map;

public class Task9 {

	public static void main(String[] args) {
		String str1 = "Do you know that London is the capital of Great Britain? London is the beautuful catipal. Do you want to visit London?";
		String [] strArray = str1.toLowerCase().replaceAll("(?u)[^\\pL ]", "").split(" ");
          
		for (String st: strArray){
			System.out.println(st);
		}
		Map <String, Integer> counterMap = new HashMap<>();
        for (String word : strArray) {
            if(word != null) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
	}
	}
}
