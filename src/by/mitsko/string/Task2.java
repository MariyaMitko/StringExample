package by.mitsko.string;

public class Task2 {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str1 = "London is the capital of Great Britain";
        String str2 = str1.replaceAll(" ", "").toLowerCase();
     
        
        char [] charArray = str2.toCharArray();
        for(int i = 0; i < str2.length(); i++){
            System.out.print(charArray[i] + "  ");
        }
        
        System.out.println();
        for (char x : charArray){
            if(x == ' '){
               System.out.print("");
                  } else {
                  int i = alphabet.lastIndexOf(x);
                  i++;
                  System.out.print(i + " ");
	            }
        }
}
}