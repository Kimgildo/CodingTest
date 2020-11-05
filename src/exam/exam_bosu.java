package exam;

public class exam_bosu {
	
	static String result = "";
	public static int bosu(int n) {
		
		while(n/2>0) {
				int num;
				num = n%2;
				n = n/2;
				result += Integer.toString(num);
			
		}
		if(n==1) {
			result += "1";
		}
		String newResult = "";
		for(int i=result.length()-1; i>=0; i--) {
			newResult += result.charAt(i);
		}
		String revResult = "";
		for(int i=0; i<newResult.length(); i++) {
			if((newResult.charAt(i)-'0')==0) {
				revResult += "1";
			}else{
				revResult += "0";
			}
		}
		String revResult2 = "";
		for(int i=revResult.length()-1; i>=0; i--) {
			revResult2 += revResult.charAt(i);
		}
		int res = 0;
		int j=0;
		for(int i = revResult2.length()-1; i>=0; i--) {
			res += (revResult2.charAt(i)-'0')*Math.pow(2, j++);
		}

		return res;
		
	}
	public static void main(String[] args) {
		System.out.println(bosu(27));
	}
}
