package by.mitsko.string;

public class Task7 {

	public static void main(String[] args) {
		String str1 = "Hello, my diar friend. How are you? Look, what a beautiful day!";
		
		char [] charArray = str1.toCharArray();
		for (char x : charArray){
			if(Character.isLetter(x) || x == ' '){
				System.out.print(x);
			}
		}

	}

}
