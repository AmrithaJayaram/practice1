package demo2;
import java.util.Scanner;
public class fuel_program {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the fuel level: ");
		float fuel =sc.nextFloat();
		System.out.print("Enter the fuelusage amount: ");
		float fuelusage = sc.nextFloat();
		System.out.print("Enter additional passengers (excluding driver): ");
		int additional_passenger = sc.nextInt();
		System.out.print("Use of AC: ");
		boolean ac_use = sc.nextBoolean();
		
		if (additional_passenger>0){
			if(ac_use==false){
				fuelusage = fuelusage+(float) (fuelusage*0.05*additional_passenger);
				System.out.print("The fuelusage level is: "+fuelusage);
				float distance = (100*fuel)/fuelusage;
				System.out.println();
				System.out.print("The total distance covered "+distance);
			}
			else{
				fuelusage = fuelusage+(float) (fuelusage*0.05*additional_passenger);
				fuelusage = fuelusage+(float) (fuelusage+0.1*fuelusage);
				System.out.print("The fuelusage level is: "+fuelusage);
				float distance = (100*fuel)/fuelusage;
				System.out.println();
				System.out.print("The total distance covered "+distance);
			}
		}
		else if(additional_passenger==0){
			if(ac_use==false){
				System.out.print("The fuelusage level is: "+fuelusage);
				float distance = (100*fuel)/fuelusage;
				System.out.println();
				System.out.print("The total distance covered "+distance);
			}
			else{
				fuelusage = fuelusage+(float) (fuelusage*0.1);
				System.out.print("The fuelusage level is: "+fuelusage);
				float distance = (100*fuel)/fuelusage;
				System.out.println();
				System.out.print("The total distance covered "+distance);
			}
		}
	}
}
