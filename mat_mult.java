package demo2;
import java.util.Scanner;
public class mat_mult {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("row1: ");
		int m1 = sc.nextInt();
		System.out.print("col1: ");
		int c1 = sc.nextInt();
		System.out.print("row2: ");
		int m2 = sc.nextInt();
		System.out.print("col2: ");
		int c2 = sc.nextInt();
		
		int[][] ma1 = new int[m1][c1];
		int[][] ma2 = new int[m2][c2];
		for(int i=0;i<m1;i++){
			for(int j=0;j<c1;j++){
				ma1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(ma1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<m2;i++){
			for(int j=0;j<c2;j++){
				ma2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(ma2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		if (c1==m2){
			int [][] sum = new int[m1][c2];
			for (int i=0;i<m1;i++){
				for(int j=0;j<c2;j++){
					for(int k=0;k<c1;k++){
						sum[i][j] = sum[i][j]+ma1[i][k]*ma2[k][j];
					}
				}
			}
			for (int i=0;i<m1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
