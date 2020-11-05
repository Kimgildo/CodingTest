package exam;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class exam_nhn {

	static int[][] arr = {{0, 1, 1, 0, 0 ,0}, 
			{0, 1, 1, 0, 1, 1},
			{0, 0, 0, 0, 1, 1},
			{0, 0, 0, 0, 1, 1},
			{1, 1, 0, 0, 1, 0},
			{1, 1, 1, 0, 0, 0}};


	static HashMap<Integer,Integer> resMap = new HashMap<>();

	public static void main(String[] args) {

		System.out.println(arr.length+2);
		int[][] arr2 = new int[arr.length+2][arr.length+2];

		for(int i =0; i<arr2.length; i++) {
			for(int j =0; j<arr2[i].length; j++) {
				if(i==0 || i==arr2.length-1) {
					arr2[i][j] = 0;
				}else if(j==0 || j==arr2.length-1) {
					arr2[i][j] = 0;
				}else {
					arr2[i][j] = arr[i-1][j-1];
				}

			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {

				System.out.print(arr[i][j]);

			}
			System.out.println();
		}

		System.out.println("----------------");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {

				System.out.print(arr2[i][j]);

			}
			System.out.println();
		}

		Stack<Integer> stack = new Stack<>();
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {

				if(arr2[i][j] == 1) {
					if(arr2[i-1][j] == 0 && arr2[i][j-1] == 0) {
						map.put(i-1, j-1);
					}
				}	
			}			
		}
		System.out.println(map);
		System.out.println(map.size());
		int[] resultArr = new int[map.size()];

		String result = "";
		for(java.util.Map.Entry<Integer, Integer> elem : map.entrySet()){
			stack.clear();
			stack.push(elem.getKey()+elem.getValue());
			int x = elem.getKey();
			int y = elem.getValue();
			for(int i=x; i<arr.length; i++) {
				inner : for(int j=y; j<arr[i].length; j++) {
					if(arr[i][j] == 1) {
						count++;

						if((i+j) - stack.peek() >= 2) {

							continue inner;
						}else {
							stack.push(i+j);
						}
					}
				}
			}
			stack.remove(1);
			//System.out.print(stack);
			//System.out.print(stack.size()+" ");
			result += Integer.toString(stack.size());
		}
		for(int i=0; i<result.length(); i++) {
			resultArr[i] = result.charAt(i)-'0';
		}
		Arrays.sort(resultArr);

		for(int i =0; i<resultArr.length; i++) {

			System.out.print(resultArr[i]+" ");
		}

	}
}

