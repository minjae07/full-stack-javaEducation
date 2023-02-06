package kr.or.shi.loop03;

/*
 *          *   *    3칸
 *           * *     1칸
 *            *      0칸
 *           * *     1칸
 *          *   *    3칸
 */
public class XTest {

	public static void main(String[] args) {
		
		/*
		 * x, y는 서로 자리를 바꿔가면서 조건에 대입되고 있으며 *의 자리값이 된다.
		 */
		
		int x=1;
		int y=5;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				//System.out.print("*");
				if(j == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x++;
			y--;
		}

	}

}
