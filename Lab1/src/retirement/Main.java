package retirement;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Main {

		public static void main(String[] args) {
				double rate;
				double time;
				double payment;
				double presentVal;
				double futureVal;
				boolean t;
	
				Scanner AskUser = new Scanner(System.in);
	
				// Present Value
				Double PV;
				Double PMT;
				Double RI;
				Double SSI;
				
				
				System.out.println("How many years do you plan to work:");
				rate = AskUser.nextDouble();
	
				System.out.println("What is your expected average return on investment:");
				annualreturn = AskUser.nextDouble();
				annualreturn = annualreturn / 12;
				
				System.out.println("How long do you want to draw:");
				t = AskUser.nextDouble();
				time = time * 12;
	
				System.out.println("What is your required income:");
				RI = AskUser.nextDouble();
	
				System.out.println("What is your expected ISS income:");
				SSI = AskUser.nextDouble();
	
				
				payment = RI - SSI;
				futureValue = 0;
				t = false;
		
				PV = FinanceLib.pv(rate, annualreturn, payment, futureVal,t);
	
				System.out.println("Youre present value is" + PV);
	
				// Payment
	
				System.out.println("What is your annual return:");
				annualreturn = AskUser.next();
				annualreturn = annualreturn /12;
	
				System.out.println("How many years do you plan to work:");
				time = AskUser.next();
	
				rate = rate / 12;
				time = time * 12;
				presentVal = 0;
				futureVal = PV;
				t = false;
	
				PMT = FinanceLib.pmt(rate, time , payment,futureVal,t);
				System.out.println("Your payment is" + PMT);
				
		}
}
