package by.mitsko.string;

import java.util.HashMap;
import java.util.Map;

public class Task32 {

	public static void main(String[] args) {
		
		String str1 = "Do you know that London is the capital of Great Britain? London is the beautuful catipal. Do you want to visit London?";
		String [] strArray = str1.toLowerCase().replaceAll("(?u)[^\\pL ]", "").split(" ");
		String word = "London";
		String word2 = word.toLowerCase();
		int count = 0;
		
		for (String st: strArray){
			if (st.equals(word2)){
				count++;
			}
		}
		
        System.out.println(count);
    }
}
