package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class exam1_split {
	
	 public static String solution(String sentence) {
	        String answer = "";
	        String[] array_st;
	        
	        int tmp;
	        String[] array_ap = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
	                                         "o","p","q","r","s","t","u","v","w","x","y","z"};
	        
	        String s = sentence;
	        String out = "";
	        s = s.replaceAll("[^a-zA-Z]","");
	        
	        for(int i=0; i< s.length(); i++){
	            tmp = (int)s.charAt(i);
	            if( (65 <= tmp)&&(tmp<=90)){
	                out += (char)(tmp + 32);
	            }else{
	                out += (char)tmp;
	            }
	        }
	        array_st = out.split("");
	        for(int i=0; i<array_st.length; i++) {
	        	System.out.println(array_st[i]);
	        }
	        System.out.println("-------------------");
	        System.out.println(array_st[0]);
	        //System.out.println(array_st[1]);
	        
	        for(int i=0; i<array_st.length; i++){
	            if(Arrays.asList(array_ap).contains(array_st[i])){
	                java.util.List<String> list = new ArrayList<>(Arrays.asList(array_ap));
	                list.remove(array_st[i]);
	                array_ap = list.toArray(new String[list.size()]);
	            }
	        }
	        for(int i=0; i<array_ap.length; i++){
	            answer += array_ap[i];
	        }
	        if(answer.equals("")){
	            answer = "perfect";
	        }
	        return answer;
	    }
	 
	public static void main(String[] args) {
		System.out.println(solution("abcdefghijklmnop"));
	}
}
