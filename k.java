/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-21 11:51:50
 * @version $Id$
 */
public class k{
	public static void main(String[] args) {
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<(9-1-i) ;j++ ) {
                 System.out.print(" ");
			}
			for (int j=0;j<2*i+1 ;j++ ) {
				System.out.print("*");
			}System.out.println();
		}
		for (int i=0;i<8 ;i++ ) {
			for (int j=0;j<(i+1) ;j++ ) {
				System.out.print(" ");
			}
			for (int j=0;j<2*(7-i)+1 ;j++ ) {
				System.out.print("*");
			}System.out.println();
		}
	}
}	