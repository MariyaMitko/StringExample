package by.mitsko.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tast24 {

	public static void main(String[] args) {
		//int a;
		double sum = 0;
//		Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
//		Matcher matcher = pat.matcher("qwet 1 gjlnl 3 gkg 6 kfkff 5");
//		while (matcher.find()) {
//			String s = matcher.group();
//			int a = Integer.parseInt(s);
//			sum = sum + a;
//		}
		
		String str = "qwet 1 gjlnl 3.5 gkg 6 kfkff 5";
		String [] strArray = str.replaceAll("[a-zA-Zà-ÿÀ-ß]","").split(" ");
		
		for (String st: strArray){
			
			 if(st.isEmpty()){
		    	 continue;
			    }else{
			        double a = Double.parseDouble(st);
			            if(a%2  == 0 || a%2 == 1 ){
			    	    
			    	       sum = sum + a;
			     }
			 }
			
			}
		    System.out.println(sum);
		
	}

	}


