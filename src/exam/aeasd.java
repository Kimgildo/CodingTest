package exam;

import java.util.Stack;

public class aeasd {
	
	static final String Red = "R";
	static final String Green = "G";
	static final String Blue = "B";
	
	static int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	static String pro =  "3(R2(GB))";
	static String pro2 = "3(R2(GB))";
	public static void main(String[] args) {
		
		int count1 = 0;
		int count2 = 0;
		String result = "";
		String res = "";
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		String[] strArr = new String[pro2.length()];
		strArr = pro2.split("");
			
		
		if(pro2.contains("(")) {
			
			for(int i=0; i<pro2.length(); i++) {
				if(Character.toString(pro2.charAt(i)).equals("(")) {
					stack1.push(count1);
				}
				count1++;
			}
			
			for(int i=0; i<pro2.length(); i++) {
				if(Character.toString(pro2.charAt(i)).equals(")")) {
					stack2.push(count2);
				}
				count2++;
			}
			
			int[] sta = new int[stack2.size()];
			
			for(int i=0; i<sta.length; i++) {
				sta[i] = stack2.pop();
			}
			for(int i=0; i<sta.length; i++) {
				stack3.push(sta[i]);
			}
			
			//(, ) 위치 스택에 넣기
			while(!stack1.empty()) {
			
			for(int i = stack1.peek()+1; i<=stack3.peek()-1; i++) {
				result += strArr[i];
			}
			switch(strArr[stack1.peek()-1]) {
			case Red:
				for(int i =0; i<result.length(); i++) {
					res += Red+result.charAt(i);
				}
				break;
			case Blue:
				for(int i =0; i<result.length(); i++) {
					res += Blue+result.charAt(i);
				}
				break;
			case Green:
				for(int i =0; i<result.length(); i++) {
					res += Green+result.charAt(i);
				}
				break;
			}
			if(48<=strArr[stack1.peek()-1].charAt(0) && strArr[stack1.peek()-1].charAt(0)<=57 ) {
				for(int i =0; i<strArr[stack1.peek()-1].charAt(0)-'0'; i++) {
					res += result;
				}
			}
			for(int i =1; i<strArr.length; i++) {
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Red)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Blue)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Green)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
			}
			for(int i =1; i<strArr.length; i++) {
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Red)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Blue)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
				if((48<=strArr[i-1].charAt(0) && strArr[i-1].charAt(0)<=57) && strArr[i].equals(Green)  ) {
					for(int j=0; j<strArr[i-1].charAt(0)-'0'; j++) {
						res += strArr[i];
					}
				}
			}
			stack1.pop();
			stack3.pop();
		}
		}
		System.out.println(result);
		System.out.println(res);
	}
}
