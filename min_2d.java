package demo2;

public class min_2d {
	public static void main(String[] args){
		int [][] m1 = {{12,-23},{12,-134}};
		int min = m1[0][0];
		for (int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(m1[i][j]<min){
					min=m1[i][j];
				}
			}
		}
		System.out.print(min);
	}
}
