package by.mitsko.string;

public class Task1 {

	public static void main(String[] args) {
		int k = 4;
		String str1 = new String("Hello, my diar friend. How are you? Look, what a beautiful day!");
        String [] strArray = str1.replaceAll("(?u)[^\\pL ]", "").split(" ");
        
       
       
	for (String st: strArray){
		if (st.length() > k){
		StringBuffer stb = new StringBuffer(st);
		stb.setCharAt(k, '&');
		System.out.print(stb + " ");
		}else{
			System.out.print(st + " ");
		
					}
	}
	
}
}