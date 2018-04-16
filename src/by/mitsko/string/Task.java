package by.mitsko.string;

public class Task {

	public static void main(String[] args) {
		String str1 = "Do you know that London is the capital of Great Britain? London is the beautuful catipal. Do you want to visit London?";
		String [] strArray = str1.toLowerCase().replaceAll("(?u)[^\\pL ]", "").split(" ");
		String word = "London";
		String word2 = word.toLowerCase();
		int count = 0;
		
		for (String st: strArray){
			if (st != null){
			if(st == "london"){
				count++;
			}
			}
		}
			System.out.println(count);
			
		}
	}


