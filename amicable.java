package demo2;
import java.util.*;  
public class amicable {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number: ");  
		int n1= sc.nextInt();
		System.out.println();
		System.out.print("Enter second number: ");  
		int n2= sc.nextInt();
		
		// int n1 = 63020,n2 =76084 ;
		int s = 0, t = 0;
		for (int i = 1;i<n1;i++){
			if (n1%i==0){
				System.out.print(i+" ");
				s = s+i;
			}
		}
		System.out.print("sum:"+s);
		System.out.println();
		for (int j = 1;j<n2;j++){
			if (n2%j==0){
				System.out.print(j+" ");
				t = t+j;
			}
		}
		System.out.print("sum:"+t);
		System.out.println();
		if (t==n1 && s==n2){
			System.out.print("the two numbers are amicable numbers");
		}
		else{
			System.out.print("the two numbers are not amicable numbers");
		}
	}

}
