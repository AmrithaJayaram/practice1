package demo2;
import java.util.Scanner;
public class stutter {
	public static void main(String[] args){
		findstutter();
	}
	public static void findstutter(){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String s1 =sc.nextLine();
		String s2 = " ";
		for(int i=1;i<=2;i++){
			s2 = s2 +s1.substring(0,2)+"...";
		}
		System.out.print(s2+s1+"?");
	}
}
