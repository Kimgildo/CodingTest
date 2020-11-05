package exam;

public class exam_Palindrome {
	
	static String s = "IAEFGSADAOFSOSPIPOKTOOTSCIVIC";
	static String s1 = "SOFTWAREPROGRAMING";
	static int q=3;
	
	public static String pal(String s) {
		String result = "";
		//int q=3;
		for(int i=q; i<=s.length(); i++) {
			System.out.println(q); //q = 3
			int j = 0;
			String newNum = "";
			String revNum = "";
			int w=0;
			label : for(j=w; j<i; j++) {
				System.out.println(w);
				System.out.println(i);
				newNum += s.charAt(j);
				if(newNum.length() == i) {
					for(int k = newNum.length()-1; k>=0; k--) {
						revNum += newNum.charAt(k);
					}
					if(newNum.equals(revNum)) {
						result += revNum + " ";
					}
					w++;
					if(i<s.length()) {
						i++;
					}else
						break label;
					
				}
			}
		
			if(q != s.length()) {
				q++;
			}
			System.out.println(q);
		}
		System.out.println(q);
		return result;
	}
	
	public static String pal2(String s) {
		String result = "";
		int cnt = 0;
		for(int i=3; i<=s.length(); i++) {
			for(int j=0; j<=s.length()-i; j++) {
				String newNum = "";
				String revNum = "";
				for(int k=j; k<j+i; k++) {
					newNum += s.charAt(k);
				}
				for(int w = newNum.length()-1; w>=0; w--) {
					revNum += newNum.charAt(w);
				}
				if(newNum.equals(revNum)) {
					cnt++;
					result += revNum + " ";
				}
				}
			
		}
		if(cnt != 0) {
			result += " ,"+" "+Integer.toString(cnt);
		}else
			result = Integer.toString(cnt);
		
		return result;
		}
		
	
	public static void main(String[] args) {
		System.out.println(pal2(s1));
	}
}
