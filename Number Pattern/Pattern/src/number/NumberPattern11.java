package number;


/*
1 3 5 7 9
3 5 7 9 11
5 7 9 11 13
7 9 11 13 15
9 11 13 15 17
 */
public class NumberPattern11 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=5;i++) {
			int k=2*i-1;
			for(int j=1;j<=5;j++) {
				System.out.print(k+" ");
				k +=2;
			}
			System.out.println();
		}
	}

}
