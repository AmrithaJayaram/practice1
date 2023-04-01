package demo2;
import java.util.Scanner;
public class ish_progeam {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a value ");
		int n1=sc.nextInt();
		String s1 = Integer.toString(n1);
		int sum = 0;
		for (int i = 0;i<s1.length();i++){
			sum = sum+Character.getNumericValue(s1.charAt(i));
		}
		if (sum%2==0){
			System.out.print(sum+" is evenish");
		}
		else{
			System.out.print(sum+" "+"is oddish");
		}
	}
}
