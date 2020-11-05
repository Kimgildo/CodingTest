package exam;

public class exam1_exam {
	
	public static void main(String[] args) {
		int[] res = new int[3];
		int x = 0;
		int xx = 0;
		int y = 0;
		int yy = 0;
		
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		for(int i = 0; i<res.length; i++) {
			res[i] = v[i][0];
		}
		for(int i =0; i<res.length; i++) {
			for(int j = i+1; j<res.length; j++) {
				if(res[i] == res[j]) {
					x = res[i];
				}
			}
		}
		System.out.println(x);
		for(int i = 0; i<res.length; i++) {
			if(res[i] != x) {
				xx = res[i];
			}
		}
		System.out.println(xx);
		//////////////////////////////
		for(int i = 0; i<res.length; i++) {
			res[i] = v[i][1];
		}
		for(int i =0; i<res.length; i++) {
			for(int j = i+1; j<res.length; j++) {
				if(res[i] == res[j]) {
					y = res[i];
				}
			}
		}
		System.out.println(x);
		for(int i = 0; i<res.length; i++) {
			if(res[i] != y) {
				yy = res[i];
			}
		}
		System.out.println(yy);
		
	}
}
