//Write a Java program to compare two strings lexicographically. Two strings are 
// lexicographically equal if they are the same length and contain the same 
//characters in the same positions
package demo2;
import java.util.Scanner;
public class lexigrapg {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int result = s1.compareTo(s2);
		System.out.print(result);
		if (result<0){
			System.out.print("str1 is less than str2");
		}
		else if(result==0){
			System.out.print("lexiographic");
		}
		else{
			System.out.print("str1 is greater than str2");
		}
	}
}
