package exam;

public class exam_triangle {
	
	static int num[] = {51, 25, 63, 36, 71, 47};
	
	public static int angle(int num[]) {
		int result = 0;
		double c = 0;
		double a = 0;
		double b = 0;
		boolean th = true;
		
		double n1 = num[2]-num[0];
		double n2 = num[3]-num[1];
		double n3 = num[5]-num[1];
		double n4 = num[4]-num[0];
		double n5 = num[4]-num[2];
		double n6 = num[5]-num[3];
		
		if((n2)/(n1) == (n3)/(n4)) {
			result = 0;
			th = false;
		}
		
		if(th) {
		a = Math.sqrt(Math.pow(n1,2) + Math.pow(n2,2));
		b = Math.sqrt(Math.pow(n4,2) + Math.pow(n3,2));
		c = Math.sqrt(Math.pow(n5,2) + Math.pow(n6,2));
		
		double max;
		
		 if (a >= b && a >= c) {
	            max = a;
	        } else if (b >= a && b >= c) {
	            max = b;
	        } else {
	            max = c;
	        }
		
		 if(max == a) {
			 if(Math.pow(a, 2) == Math.pow(b, 2)+Math.pow(c, 2)) {
				 result = 1;
			 }else if(Math.pow(a, 2) > Math.pow(b, 2)+Math.pow(c, 2)) {
				 result = 2;				 
			 }else
				 result = 3;
		 }
		 
		 if(max == b) {
			 if(Math.pow(b, 2) == Math.pow(a, 2)+Math.pow(c, 2)) {
				 result = 1;
			 }else if(Math.pow(b, 2) > Math.pow(a, 2)+Math.pow(c, 2)) {
				 result = 2;				 
			 }else
				 result = 3;
		 }
		 
		 if(max == c) {
			 if(Math.pow(c, 2) == Math.pow(a, 2)+Math.pow(b, 2)) {
				 result = 1;
			 }else if(Math.pow(c, 2) > Math.pow(a, 2)+Math.pow(b, 2)) {
				 result = 2;				 
			 }else
				 result = 3;
		 }
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(angle(num));
	}
}
