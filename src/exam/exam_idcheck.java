package exam;

public class exam_idcheck {
	
	static String num = "010000200312060638";
	static String num1 = "10000020100727890X";
	public static String check(String s) {
		String area = "";
		String result = "";
		String birth = "";
		String sort = "";
		
		int hap = 0;
		for(int i=0; i<6; i++) {
			area += s.charAt(i);
			hap += s.charAt(i) - '0';
		}
		if(hap != 1) {
			result = "Invalid";
		}
		for(int i=6; i<14; i++) {
			birth += s.charAt(i);
		}
		if(Integer.parseInt(birth)>=19000101 && Integer.parseInt(birth) <=20141231) {
			
		}else {
			result = "Invalid";
		}
		for(int i=14; i<17; i++) {
			sort += s.charAt(i);
		}
		if(sort.equals("000")) {
			result = "Invalid";
		}else if(Integer.parseInt(sort)%2 == 1) {
			result = "Male";
		}else {
			result = "Female";
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(check(num1));
	}
}
